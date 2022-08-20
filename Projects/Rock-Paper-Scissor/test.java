import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// input object
        String userChoice = "";// stores user choice
        // byte userNum; //stores number to get choice
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
            System.out.println(computerChoice);
            // User Choice
            System.out.print("Choose any One Number between:");
            userChoice = scanner.next();
            if (userChoice !="Rock" || userChoice != "Paper" || userChoice != "Scissor") {
            System.out.println("Choose between Rock paper scissor");
            }else{
                System.out.println("H");
            }
            // Battle Begins
            if (computerChoice.equals(userChoice)) {
                userScore += 1;
                computerScore += 1;
                System.out.println(" ");
                System.out.println("You chooses " + userChoice + " & Computer chooses " + computerChoice);
                System.out.println("Draw");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
                System.out.println(" ");
                // User winning conditions
            } else if (computerChoice.equals("Rock") && userChoice.equals("Paper")) {
                userScore += 2;
                System.out.println(" ");
                System.out.println("You chooses " + userChoice + " & Computer chooses " + computerChoice);
                System.out.println("You Win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
                System.out.println(" ");
            } else if (computerChoice.equals("Paper") && userChoice.equals("Scissor")) {
                userScore += 2;
                System.out.println(" ");
                System.out.println("You chooses " + userChoice + " & Computer chooses " + computerChoice);
                System.out.println("You Win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
                System.out.println(" ");
            } else if (computerChoice.equals("Scissor") && userChoice.equals("Rock")) {
                userScore += 2;
                System.out.println(" ");
                System.out.println("You chooses " + userChoice + " & Computer chooses " + computerChoice);
                System.out.println("You win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
                System.out.println(" ");
                // Computer winning conditions
            }else if(computerChoice.equals("Paper") && userChoice.equals("Rock")){
                computerScore += 2;
                System.out.println(" ");
                System.out.println("You chooses " + userChoice + " & Computer chooses " + computerChoice);
                System.out.println("Computer Win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
                System.out.println(" ");
            }else if(computerChoice.equals("Scissor") && userChoice.equals("Paper")){
                computerScore += 2;
                System.out.println(" ");
                System.out.println("You chooses " + userChoice + " & Computer chooses " + computerChoice);
                System.out.println("Computer Win");
                System.out.println("Your Score:" + userScore);
                System.out.println("Computer Score:" + computerScore);
                System.out.println(" ");
            }else if(computerChoice.equals("Rock") && userChoice.equals("Scissor")){
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