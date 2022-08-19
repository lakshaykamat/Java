import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Num1 = ");
        byte num1 = scanner.nextByte();// stores num1
        System.out.print("Enter Num2 = ");
        byte num2 = scanner.nextByte();// stores num2
        byte gcd = 0;

        // Calculating GCD (GCD is always will lowest of then the given number)
        // i will the number that will divide the numbers and checks the remainder will
        // 0 or not (i will increment every time loops runs)
        for (byte i = 1; i <= num1 && i <= num2; i++) {
            // here checks the both remainder will 0 or not
            if (num1 % i == 0 && num2 % i == 0) {
                // every i stores in gcd and overwrite the past number so we get highest divisble
                gcd = i;
            }
        }
        // calculating lcm by formula
        int lcm = (num1 * num2) / gcd;
        System.out.println("The GCD of " + num1 + " & " + num2 + " is " + gcd);
        System.out.println("The LCM of " + num1 + " & " + num2 + " is " + lcm);
    }
}
