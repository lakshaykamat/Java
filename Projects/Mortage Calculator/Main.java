import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte monthsInAYear = 12;
        final byte percentage = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal Amount: ");
        int principal = scanner.nextInt();

        System.out.print("Enter the Annual Intrest: ");
        float annualIntrest = scanner.nextInt();
        float monthlyIntrest = annualIntrest / percentage / monthsInAYear;

        System.out.print("Enter Period years: ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * monthsInAYear;

        double mortage = principal * 
        (monthlyIntrest * Math.pow(1 +monthlyIntrest, numberOfPayments)
        / Math.pow(1  + monthlyIntrest, numberOfPayments) - 1);

        System.out.println(mortage);
    }
}
