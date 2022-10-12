import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        myInterface myInterface = (x) -> {
            System.out.println("Hello " + x);};

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        myInterface.msg(name);
    }
}