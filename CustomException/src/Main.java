import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {

        // calling the method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        scanner.close();
        validate(age);

    }
    // method to check the age
    static void validate (int age) throws InvalidAgeException{
        if(age < 18){
            // throw an object of user defined exception
            throw new InvalidAgeException("Age is not valid to vote");
        }else{
            System.out.println("welcome to vote");
        }
    }
}