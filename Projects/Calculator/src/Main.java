import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Num1 = ");
        int num1  = scanner.nextInt();
        System.out.print("Enter Num2 = ");
        int num2 = scanner.nextInt();
        System.out.print("Enter Operator [+ , - , / , %] = ");
        char c = scanner.next().charAt(0);
        switch (c) {
            case '+' -> System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
            case '/' -> System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
            case '-' -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
    }
}
