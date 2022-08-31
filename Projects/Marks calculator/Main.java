import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Report reportcard = new Report();
        Scanner scanner = new Scanner(System.in);

        // user name
        System.out.print("What's your name: ");
        String name = scanner.nextLine();

        // user standard
        System.out.print("Whats's your Standard: ");
        String standard = scanner.nextLine();

        // subjects user have
        System.out.print("How many subjects do you have? ");
        byte Subcount = scanner.nextByte();

        // converted marks to a arrays
        int[] marksArray = reportcard.marksToArray(Subcount);
        //total marks
        int obtainedMaarks = reportcard.calculateObtainedMarks(marksArray);
        // percentage
        double percentage = reportcard.percentage(marksArray,obtainedMaarks);
        // final report
        reportcard.finalReport(name, standard, marksArray, obtainedMaarks, percentage);


    }

}
