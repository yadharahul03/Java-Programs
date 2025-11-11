@echo off
cd /d "D:\Java Programs"

echo Compiling all .java files...
for /r src %%f in (*.java) do javac -d bin "%%f"

if %errorlevel% neq 0 (
    echo ❌ Compilation failed. Fix your code.
    pause
    exit /b
)

echo.
echo ✅ Compilation successful.

echo.
echo Enter the name of the class containing main (without .java):
set /p className=

echo.
echo Running %className%...
java -cp bin %className%

echo.
pause
