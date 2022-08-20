import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Factorial program
        // ex- factorial of 5 is (1*2*3*4*5) that is 120
        // formula is 5! = 5*4*3*2*1
        System.out.print("Enter Number to get Factorial: ");
        double num = scanner.nextDouble();
        double factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
            // 1st iteration 1 * 1 = 1 (factorial = 1)
            // 2nd iteration 1 * 2 = 2 (factorial = 2)
            // 3rd iteration 2 * 3 = 6 (factorial = 6)
            // 4th iteration 6 * 4 = 24 (factorial = 24)
            // 5th iteration 24 * 5 = 120 (factorial = 120)
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
