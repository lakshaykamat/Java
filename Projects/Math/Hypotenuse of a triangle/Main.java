import java.math.MathContext;
import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double side_X;
        double side_Y;
        System.out.print("Enter the side X:");
         side_X = scanner.nextDouble();
        System.out.print("Enter the side Y:");
        side_Y = scanner.nextDouble();

        //formula
        //Math.sqrt( (x*x) + (y*y) );
        double answer = Math.sqrt(Math.pow(side_X, 2) + Math.pow(side_Y, 2));
        System.out.println("The Hypotenuse is: "+answer);
    }
}