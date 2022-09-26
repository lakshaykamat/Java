import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Car \n2. Bike");
        int choice = scanner.nextInt();
        if(choice == 1){
            vehicle = new Car();
            vehicle.go();
        }
        else{
            vehicle = new Bike();
            vehicle.go();
        }

    }
}