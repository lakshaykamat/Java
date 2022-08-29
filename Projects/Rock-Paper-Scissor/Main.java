import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// input object
        String userChoice = "";// stores user choice
        byte userNum; //stores number to get choice
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
                computerChoice = "Rock";
            } else if (randomNum == 2) {
                computerChoice = "Paper";
            } else {
                computerChoice = "Scissor";
            }
            
            // User Choice
            System.out.print("Choose any One Number between:");
            userNum = scanner.nextByte();
            if (userNum == 1) {
                userChoice = "Rock";
            } else if (userNum == 2) {
                userChoice = "Paper";
            }else if(userNum == 3){
                userChoice = "Scissor";
            } else {
                System.out.println("Choose between 1-3");
            }
            // Battle Begins
            if (computerChoice == userChoice) {
                userScore += 1;
                computerScore += 1;
                System.out.println(" ");
                System.out.println("You chooses " + userChoice + " & Computer chooses " + computerChoice);
                System.out.println("Draw");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
                System.out.println(" ");
                // User winning conditions
            } else if (computerChoice == "Rock" && userChoice == "Paper") {
                userScore += 2;
                System.out.println(" ");
                System.out.println("You chooses " + userChoice + " & Computer chooses " + computerChoice);
                System.out.println("You Win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
                System.out.println(" ");
            } else if (computerChoice == "Paper" && userChoice == "Scissor") {
                userScore += 2;
                System.out.println(" ");
                System.out.println("You chooses " + userChoice + " & Computer chooses " + computerChoice);
                System.out.println("You Win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
                System.out.println(" ");
            } else if (computerChoice == "Scissor" && userChoice == "Rock") {
                userScore += 2;
                System.out.println(" ");
                System.out.println("You chooses " + userChoice + " & Computer chooses " + computerChoice);
                System.out.println("You win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
                System.out.println(" ");
                // Computer winning conditions
            }else if(computerChoice == "Paper" && userChoice == "Rock"){
                computerScore += 2;
                System.out.println(" ");
                System.out.println("You chooses " + userChoice + " & Computer chooses " + computerChoice);
                System.out.println("Computer Win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
                System.out.println(" ");
            }else if(computerChoice == "Scissor" && userChoice == "Paper"){
                computerScore += 2;
                System.out.println(" ");
                System.out.println("You chooses " + userChoice + " & Computer chooses " + computerChoice);
                System.out.println("Computer Win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
                System.out.println(" ");
            }else if(computerChoice == "Rock" && userChoice == "Scissor"){
                computerScore += 2;
                System.out.println(" ");
                System.out.println("You chooses " + userChoice + " & Computer chooses " + computerChoice);
                System.out.println("Computer Win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
                System.out.println(" ");
            }else {
                System.out.println("Something went wrong...");
            }
        }
        result(userScore, computerScore);
    }
    //Result function
    static void result(byte userScore,byte computerScore){
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