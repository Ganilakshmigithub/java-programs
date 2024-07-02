import java.util.Scanner;

public class recpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        // Nested loop to iterate through each row and column
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                // Condition to check if it's the first or last row/column or the borders
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces for hollow effect
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        
        sc.close(); // Close the scanner
    }
}

