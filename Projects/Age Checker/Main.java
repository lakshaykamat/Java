import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        final byte age;
        System.out.print("Enter your age:");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextByte();
        if(age >= 18){
            System.out.println("You can drive a car");
        }else{            System.out.println("You can't drive a car");
        }
    }
}
