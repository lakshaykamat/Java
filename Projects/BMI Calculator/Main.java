import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight;
        float height;
        byte userChoice = 0;     
            System.out.println("1. kilogram and metre");
            System.out.println("2. kilogram and centimetre");
            System.out.println("3. Pounds and metre");
            System.out.println("4. Pounds and centimetre");
            System.out.print("Choose any of them : ");
            userChoice = scanner.nextByte();

        if (userChoice == 1) {
            
            System.out.print("Enter your weight(kg): ");
            weight = scanner.nextFloat();
            System.out.print("Enter your height(m): ");
            height = scanner.nextFloat();
            
            double bmi = kgTom(weight, height);
            System.out.print("Your Bmi is ");
            System.out.format("%.1f" + "\n", bmi);
            resultOfBmi(bmi);
            
        } else if (userChoice == 2) {
            System.out.print("Enter your weight(kg): ");
            weight = scanner.nextFloat();
            System.out.print("Enter your height(cm): ");
            height = scanner.nextFloat();
            
            double bmi = kgTocm(weight, height);
            System.out.print("Your Bmi is ");
            System.out.format("%.1f" + "\n", bmi);
            resultOfBmi(bmi);
            
        } else if (userChoice == 3) {
            System.out.print("Enter your weight(lbs): ");
            weight = scanner.nextFloat();
            System.out.print("Enter your height(m): ");
            height = scanner.nextFloat();
            
            double bmi = lbsTom(weight, height);
            System.out.print("Your Bmi is ");
            System.out.format("%.1f" + "\n", bmi);
            resultOfBmi(bmi);
            
        } else if (userChoice == 4) {
            System.out.print("Enter your weight(lbs): ");
            weight = scanner.nextFloat();
            System.out.print("Enter your height(cm): ");
            height = scanner.nextFloat();
            
            double bmi = lbsTocm(weight, height);
            System.out.print("Your Bmi is ");
            System.out.format("%.1f" + "\n", bmi);
            resultOfBmi(bmi);
        }else{
            System.out.println("Choose between 1 to 4 :(");
        }
        scanner.close();

    }

    // bmi formula for kg to m
    static double kgTom(float weight, float height) {
        double bmi = weight / Math.pow(height, 2);
        return bmi;
    }

    // bmi formula fo kg to cm
    static double kgTocm(float weight, float height) {
        float m = height / 100;
        double bmi = weight / Math.pow(m, 2);
        return bmi;
    }

    // bmi formula for lbs to m
    static double lbsTom(float weight, float height) {
        double kg = weight / 2.205;
        double bmi = kg / Math.pow(height, 2);
        return bmi;
    }

    // bmi formula for lbs to cm
    static double lbsTocm(float weight, float height) {
        double kg = weight / 2.205;
        float m = height / 100;
        double bmi = kg / Math.pow(m, 2);
        return bmi;
    }

    // results of bmi
    static void resultOfBmi(double bmi) {
        if (bmi < 18.5) {
            System.out.println("You are Underweight");
        } else if (bmi >= 18.5 && bmi <= 25.0) {
            System.out.println("You have a normal weight");
        } else if (bmi > 25.0 && bmi <= 30.0) {
            System.out.println("You are Overweight");
        } else {
            System.out.println("You have Obesity");
        }
    }
}
