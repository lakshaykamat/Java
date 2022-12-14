import java.util.Scanner;

public class Game {
    String userChoice,computerChoice;// stores user choice and computer choice
    int userScore = 0,computerScore = 0; // user Score and computer Score
    final String rock = "Rock",paper = "Paper",scissor = "Scissor";


    public void setUserChoice(String userChoice) {
        this.userChoice = userChoice;
    }

    public int getUserScore() {
        return userScore;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public void setComputerChoice(String computerChoice) {
        this.computerChoice = computerChoice;
    }

    public String getUserChoice() {
        return userChoice;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    void Battle(){
        for (int i = 1; i <= 5; i++) {
            setUserChoice(getUsrOptions());
            //if usrChoice is not null then run the battle
            if(getUserChoice() != null) {
                // Set random computer choices
                setComputerChoice(computerChoiceGenerated());
                //compare computer and user choices
                compareChoices();
                //if user choice is null then terminate the function
            }else{
                System.out.println("Program Terminated!");
                return;
            }
        }
        //show scores and result
        result(getUserScore(), getComputerScore());
    }
    //Compares choices of user's and Computer
    void compareChoices(){
        if (getComputerChoice().equals(getUserChoice())) {
            setUserScore((getUserScore() + 1));
            setComputerScore((getComputerScore() + 1));
            displayTxt(getUserChoice(), getComputerChoice(), getUserScore(), getComputerScore(), "Draw");

            // User winning conditions
        } else if (getComputerChoice().equals(rock) && getUserChoice().equals(paper)) {
            //incrementing user scores by 2
            setUserScore((getUserScore() + 2));
            displayTxt(getUserChoice(), getComputerChoice(), getUserScore(), getComputerScore(), "You Win");

        } else if (getComputerChoice().equals(paper) && getUserChoice().equals(scissor)) {
            setUserScore((getUserScore() + 2));
            displayTxt(getUserChoice(), getComputerChoice(), getUserScore(), getComputerScore(), "You Win");

        } else if (getComputerChoice().equals(scissor) && getUserChoice().equals(rock)) {
            setUserScore((getUserScore() + 2));
            displayTxt(getUserChoice(), getComputerChoice(), getUserScore(), getComputerScore(), "You Win");

            // Computer winning conditions
        } else if (getComputerChoice().equals(paper) && getUserChoice().equals(rock)) {
            setComputerScore((getComputerScore() + 2));
            displayTxt(getUserChoice(), getComputerChoice(), getUserScore(), getComputerScore(), "Computer Win");

        } else if (getComputerChoice().equals(scissor) && getUserChoice().equals(paper)) {
            setComputerScore((getComputerScore() + 2));
            displayTxt(getUserChoice(), getComputerChoice(), getUserScore(), getComputerScore(), "Computer Win");

        } else if (getComputerChoice().equals(rock) && getUserChoice().equals(scissor)) {
            setComputerScore((getComputerScore() + 2));
            displayTxt(getUserChoice(), getComputerChoice(), getUserScore(), getComputerScore(), "Computer Win");

        } else {
            System.out.println("Error in Comparing choices");
        }
    }
    void result(int userScore,int computerScore){
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
    String computerChoiceGenerated(){
        double randomNum = Math.floor((Math.random() * 3) + 1);
        if (randomNum == 1) {
            return  "Rock";
        } else if (randomNum == 2) {
            return "Paper";
        } else {
            return "Scissor";
        }
    }
   String getUsrOptions() {
        // User Choice
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissor");
            System.out.print("Choose any One Number between:");
            Scanner scanner = new Scanner(System.in);
            int userNum = scanner.nextInt();
            if (userNum == 1) {
                //Count the player choices
                return "Rock";

            } else if (userNum == 2) {
                return "Paper";

            } else if (userNum == 3) {
                return "Scissor";

            } else {
                System.out.println("Choose between 1-3");
            }
            scanner.close();
        return null;
    }
    void displayTxt(String userChoice, String computerChoice,int  userScore, int computerScore,String gameState){
        System.out.println(" ");
        System.out.println("You chooses " + userChoice + " & Computer chooses " + computerChoice);
        System.out.println(gameState);
        System.out.println("Your Score:" + userScore);
        System.out.println("Computer Score:" + computerScore);
        System.out.println(" ");
    }
}