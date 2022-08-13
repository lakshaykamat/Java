import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// input object
        String userChoice;// stores user choice
        byte userNum;
        byte userScore = 0; // user Score
        byte computerScore = 0;// Computer Score
        String computerChoice; // stores computer choice
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissor");
        // Computer choice generated here
        for (byte i = 1; i <= 5; i++) {
            double randomNum = Math.floor((Math.random() * 3) + 1);
            if (randomNum == 1) {
                computerChoice = "rock";
            } else if (randomNum == 2) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissor";
            }
            // User Choice

            System.out.print("Choose any One Number between:");
            userNum = scanner.nextByte();
            if (userNum == 1) {
                userChoice = "rock";
            } else if (userNum == 2) {
                userChoice = "paper";
            } else {
                userChoice = "scissor";
            }
            // Battle Begins
            if (computerChoice == userChoice) {
                userScore += 1;
                computerScore += 1;
                System.out.println("Draw");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
            } else if (computerChoice == "rock" && userChoice == "paper") {
                userScore += 2;
                System.out.println("You Win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
            } else if (computerChoice == "paper" && userChoice == "scissor") {
                userScore += 2;
                System.out.println("You Win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
            } else if (computerChoice == "scissor" && userChoice == "rock") {
                userScore += 2;
                System.out.println("You win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
            } else {
                computerScore += 2;
                System.out.println("Computer Win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
            }
        }

        // Result
        System.out.println("-------------Results-----------");
        if (userScore == computerScore) {
            System.out.println("Your Score:" + userScore);
            System.out.println("Computer Score:" + computerScore);
            System.out.println("Math is Draw");
        } else if (userScore > computerScore) {
            System.out.println("Your Score:" + userScore);
            System.out.println("Computer Score:" + computerScore);
            System.out.println("You wins the game");
        } else {
            System.out.println("Your Score:" + userScore);
            System.out.println("Computer Score:" + computerScore);
            System.out.println("Computer wins the game");
        }
    }
}