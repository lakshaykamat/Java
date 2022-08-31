import java.util.Scanner;

public class Report {
    Scanner scanner = new Scanner(System.in);
    byte SubjectCount;
    int[] MarksArray;
    int obtainedMarks;
    double percentage;


    // Marks to Array
    int[] marksToArray(byte Subjectcount) {
        // intiliaze the global varibale by this keyword
        this.SubjectCount = Subjectcount;
        // Creating the array by user given subjects
        int[] marks = new int[this.SubjectCount];
        // initilize the value of array by using for loop 
        for (int i = 1; i <= this.SubjectCount; i++) {
            System.out.print("Subject " + i + " = ");
            // array starts from 0 
            marks[i - 1] = scanner.nextInt();
        }
        // initilizeing global varible
        this.MarksArray = marks;
        return MarksArray;

    }
    // calculate obtained marks or sum of all marks
    int calculateObtainedMarks(int[] marks){
        int total = 0;
        for(int i = 1 ;i<=marks.length;i++){
            total += marks[i - 1];
        }
        this.obtainedMarks = total;
        return obtainedMarks;

    }
    double percentage(int[] marks, int total){
        double percen = ((obtainedMarks / (marks.length * 100.0)) * 100.0);
        this.percentage = percen;
        return percentage;
    }
    void finalReport(String name, String Standard, int[] marks, int total, double percen){
        System.out.println("-------------Report Card-------------");
        System.out.println("Student Name: " + name);
        System.out.println("Standard: " + Standard);
        for(int i = 1; i<= marks.length;i++){
            System.out.println("Subject " + i + " = " +  marks[i - 1]);
        }
        System.out.println("Total Marks = " + total + " (" + total + " out of " + marks.length*100 + ")");
        System.out.println("Percentage = " + percen + "%");
    }
}
