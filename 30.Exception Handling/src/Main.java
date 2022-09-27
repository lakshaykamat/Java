import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            byte num = scanner.nextByte();
            System.out.println(num);
        }catch(Exception e){
            System.out.println("Something Went Wrong!");
        }finally {
            System.out.println("Scanner is closed...");
            scanner.close();
        }

    }
}