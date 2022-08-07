import java.util.Scanner;

import javax.xml.transform.Source;

public class Main {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        byte num;
        byte num2;
        char operator;
        System.out.print("Enter Number1 = ");
        num = scanner.nextByte();
        
        System.out.print("Enter Number2 = ");
        num2 = scanner.nextByte();
        
        System.out.print("Enter the operator:");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.print(num);
                System.out.print(operator);
                System.out.print(num2);
                System.out.print("= ");
                System.out.println(num + num2);
                break;
            case '-':
            System.out.print(num);
            System.out.print(operator);
            System.out.print(num2);
            System.out.print(" = ");
                System.out.println(num - num2);
                break;
            case '*':
            System.out.print(num);
            System.out.print(operator);
            System.out.print(num2);
            System.out.print("= ");
                System.out.println(num * num2);
                break;
            case '/':
            System.out.print(num);
            System.out.print(operator);
            System.out.print(num2);
            System.out.print("= ");
                System.out.println(num / num2);
                break;
            default:
                System.out.println("You havn't defined the operator");
                break;
        }
    }
}
