import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        byte num = scanner.nextByte();
        for(int i = 1;i<=10;i++){
            System.out.println(num + " X "  + i + " = " + num*i);
        }
    }
}
