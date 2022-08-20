import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Fiboonaci Series
        // 0,1,1,2,3,5
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print("Enter the number: ");
        int input = scanner.nextInt();
        System.out.println("Fibonacci Series of " + input);
        // 0 and 1 will print by default
        System.out.println(n1);
        System.out.println(n2);
        // for loop
        for (int i = 1; i <= input; i++) {
            n3 = n1 + n2;// add first two numbers
            System.out.println(n3); // printing the first two numbers
            n2 = n3; // copying n3 value to n2
            n1 = n2; // copying n2 value to n1
        }
    }
}
