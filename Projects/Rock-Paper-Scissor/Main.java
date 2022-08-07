import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        String computerChoice;
        // Computer choice generated
        double randomNum = Math.floor((Math.random() * 3) + 1);
        if (randomNum == 1) {
            computerChoice = "rock";
        } else if (randomNum == 2) {
            computerChoice = "paper";
        } else {
            computerChoice = "scissor";
        }

        System.out.print("Choose any One Rock,Paper and Scissor:");
        computerChoice = "rock";
        userChoice = scanner.nextLine().toLowerCase();
        // Battle
        if (computerChoice == userChoice) {
            System.out.println("Draw");
        } else if (computerChoice == "rock" && userChoice == "paper") {
            System.out.println("You Win");
        } else if (computerChoice == "paper" && userChoice == "scissor") {
            System.out.println("You Win");
        } else if (computerChoice == "scissor" && userChoice == "rock") {
            System.out.println("You win");
        } else {
            System.out.println("Computer Win");
        }
        System.out.println(computerChoice);
        System.out.println(userChoice);
    }
}
