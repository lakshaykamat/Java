import java.util.Scanner;

public class Report {
    Scanner scanner = new Scanner(System.in);
    byte SubjectCount;//subjects user have
    int[] MarksArray;//array of marks
    int obtainedMarks;//obtained marks by user or sum of all numbers in array
    double percentage;//percentage 
    String grades;//grades

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
            //loop for checking the value is not greater than 100
            while(marks[i - 1] > 100){
                System.out.println("Marks can't be greater than 100");
                System.out.print("Subject " + i + " = ");
                marks[i - 1] = scanner.nextInt();
            }
        }
        // initilizeing global varible
        this.MarksArray = marks;
        return MarksArray;

    }

    // calculate obtained marks or sum of all marks
    int calculateObtainedMarks(int[] marks) {
        int total = 0;
        for (int i = 1; i <= marks.length; i++) {
            total += marks[i - 1];
        }
        this.obtainedMarks = total;
        return obtainedMarks;

    }

    // calculates percentage
    double percentage(int[] marks, int total) {
        double percen = ((obtainedMarks / (marks.length * 100.0)) * 100.0);
        this.percentage = percen;
        return percentage;
    }

    // calulates grades
    String calcgrades(double percentage) {
        String studentgrades = "";
        if (percentage >= 98) {
            studentgrades = "A+";
        } else if (percentage >= 93 && percentage <= 97) {
            studentgrades = "A";
        } else if (percentage >= 90 && percentage <= 92) {
            studentgrades = "A-";
        }else if(percentage >= 88 && percentage <= 89){
            studentgrades = "B+";
        }else if(percentage >= 83 && percentage <= 87){
            studentgrades = "B";
        }else if(percentage >= 80 && percentage <= 82){
            studentgrades = "B-";
        }else if(percentage >= 78 && percentage <= 79){
            studentgrades = "C+";
        }else if(percentage >= 73 && percentage <= 77){
            studentgrades = "C";
        }else if(percentage >= 70 && percentage <= 72){
            studentgrades = "C-";
        }else if(percentage >= 68 && percentage <= 69){
            studentgrades = "D+";
        }else if(percentage >= 63 && percentage <= 67){
            studentgrades = "D";
        }else if(percentage >= 60 && percentage <= 62){
            studentgrades = "D-";
        }else if(percentage <= 59){
            studentgrades = "F";
        }
        this.grades = studentgrades;
        return grades;
    }

    void finalReport(String name, String Standard, int[] marks, int total, double percen, String grades) {
        System.out.println("-------------Report Card-------------");
        System.out.println("Student Name: " + name);
        System.out.println("Standard: " + Standard);
        for (int i = 1; i <= marks.length; i++) {
            System.out.println("Subject " + i + " = " + marks[i - 1]);
        }
        System.out.println("Total Marks = " + total + " (" + total + " out of " + marks.length * 100 + ")");
        System.out.println("Percentage = " + percen + "%");
        System.out.println("Grades: " + grades);
    }
}
