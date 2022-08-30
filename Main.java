public class Main {
    public static void main(String[] args) {
        int n = 5;
        // outer loop for rows
        for (int row = 1; row <= n; row++) {
            // inner loop for columns
            for (int col = 1; col <= row; col++) {
                // prints stars
                System.out.print("* ");
            }
            // the rows the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
