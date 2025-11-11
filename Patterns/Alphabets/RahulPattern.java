package Patterns.Alphabets;

public class RahulPattern {
    // ANSI escape codes
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        int n = 8; // height of letters

        // -------- BLUE RAHUL --------
        for (int i = 0; i < n; i++) {
            printRahulRow(i, n, BLUE);
            System.out.println();
        }

        // -------- ARROW --------
        slowPrint("\n\n   -->   \n\n", 150);

        // -------- RED RAHUL --------
        for (int i = 0; i < n; i++) {
            printRahulRow(i, n, RED);
            System.out.println();
        }
    }

    // Function to print one row of "RAHUL" with a given color
    public static void printRahulRow(int i, int n, String color) throws InterruptedException {
        // ----- R -----
        for (int j = 0; j < n; j++) {
            if (j == 0 || 
                (i == 0 && j < n - 1) || 
                (i == n / 2 && j < n - 1) || 
                (j == n - 1 && i > 0 && i < n / 2) || 
                (i > n / 2 && i - j == 0)) {
                slowPrint(color + "R " + RESET, 20);
            } else {
                slowPrint("  ", 20);
            }
        }
        slowPrint("   ", 20);

        // ----- A -----
        for (int j = 0; j < n; j++) {
            if ((j == 0 || j == n - 1) && i != 0 || 
                (i == 0 && j > 0 && j < n - 1) || 
                (i == n / 2)) {
                slowPrint(color + "A " + RESET, 20);
            } else {
                slowPrint("  ", 20);
            }
        }
        slowPrint("   ", 20);

        // ----- H -----
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i == n / 2) {
                slowPrint(color + "H " + RESET, 20);
            } else {
                slowPrint("  ", 20);
            }
        }
        slowPrint("   ", 20);

        // ----- U -----
        for (int j = 0; j < n; j++) {
            if ((j == 0 && i != n - 1) || 
                (j == n - 1 && i != n - 1) || 
                (i == n - 1 && j > 0 && j < n - 1)) {
                slowPrint(color + "U " + RESET, 20);
            } else {
                slowPrint("  ", 20);
            }
        }
        slowPrint("   ", 20);

        // ----- L -----
        for (int j = 0; j < n; j++) {
            if (j == 0 || i == n - 1) {
                slowPrint(color + "L " + RESET, 20);
            } else {
                slowPrint("  ", 20);
            }
        }
    }

    // Helper method for slow printing
    public static void slowPrint(String text, int delay) throws InterruptedException {
        System.out.print(text);
        Thread.sleep(delay); // delay in milliseconds
    }
}
