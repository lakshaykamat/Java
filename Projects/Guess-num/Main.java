import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        // input object to get input from user
        double computerNum = Math.floor(Math.random() * 100 + 1);
        // generates random number between 0 to 100
        byte userNum;
        // stores given input by user
        byte moveUsed = 0;
        // move used by user
        byte totalMove = 10;
        // total moves given to user

        do {
            System.out.print("Guess a Number Between 1-100:");
            userNum = scanner.nextByte();
            if (computerNum > userNum) {
                // computer random number is greater than
                moveUsed += 1;
                // user has been used his one move from given total move
                totalMove -= 1;
                // total move is 10
                System.out.println("Guess a higher number");
                System.out.println("Moves left: " + totalMove);
            } else if (computerNum < userNum) {
                // computer generates number is less than so
                moveUsed += 1;
                // user has been used his one move from given moves
                totalMove -= 1;
                // total move is 10
                System.out.println("Guess a lesser number");
                System.out.println("Moves left: " + totalMove);
            } else {
                System.out.println("You did it!");
                moveUsed += 1;
                totalMove -= 1;
            }

            if (totalMove == 0) {
            // if total moves is 0 that means user has used all his 10 moves and still not
            // get the number
            break;
            // break the loop
            }
        } while (userNum != computerNum);
        // this loop only runs when computer random num is not equal to user choosen
        // number

        System.out.println("----------------------------RESULT----------------------");

        if (totalMove == 0) {
            // if user loose (used his all moves)
            System.out.println("You lose the Game");
            System.out.println("Moves left: " + totalMove);
            System.out.println("The number was: " + computerNum);
        } else {
            // if user wins (find the random number of computer)
            System.out.println("You Wins the game");
            System.out.println("Total Move Used : " + moveUsed);
            System.out.println("Moves left: " + totalMove);
            System.out.println("The number was: " + computerNum);
        }
    }
}