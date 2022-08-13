import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        double computerNum = Math.floor(Math.random() * 100 + 1);
        byte userNum;
        byte moveUsed = 1;
        byte totalMove = 10;
        do {
            System.out.print("Guess a Number Between 1-100:");
            userNum = scanner.nextByte();
            if (computerNum > userNum) {
                moveUsed += 1;
                totalMove -= 1;
                System.out.println("Guess a higher number");
                System.out.println("Moves left: " + totalMove);
            } else if (computerNum < userNum) {
                moveUsed += 1;
                totalMove -= 1;
                System.out.println("Guess a lesser number");
                System.out.println("Moves left: " + totalMove);
            } else {
                System.out.println("Guess between 1-100");
            }

            if (totalMove == 0) {
                break;
            }
        } while (userNum != computerNum);
        System.out.println("----------------------------RESULT----------------------");
        if (totalMove == 0) {
            System.out.println("You lose the Game");
            System.out.println("Moves left: " + totalMove);
            System.out.println("The number was: " + computerNum);
        } else {
            System.out.println("You Wins the game");
            System.out.println("Total Move Used : " + moveUsed);
            System.out.println("The number was: " + computerNum);
        }
    }
}