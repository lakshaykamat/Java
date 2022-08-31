import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter:");
        n = scanner.nextInt();
        while(n >100){
            System.out.print("Enter:");
            n = scanner.nextInt();
        }
        System.out.println(n);
    }
}
