@echo off
cd /d "D:\Java Programs"

echo Pulling latest changes...
git pull

echo Adding updates...
git add .

set curDate=%date:~-4%-%date:~3,2%-%date:~0,2%

echo Committing...
git commit -m "Daily update %curDate%"

echo Pushing to GitHub...
git push

echo.
echo ✅ Successfully synced with GitHub on %curDate%.
pause
