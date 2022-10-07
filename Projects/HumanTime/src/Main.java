import java.text.ParseException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String DOB ;
        System.out.print("Enter your DOB (dd/mm/yyyy) = ");
        DOB = scanner.next();
        try{
            MyDate myDate = new MyDate(DOB);
            System.out.println("Current Date: " + myDate.getCurrentDate());
            System.out.println("Your Date of Birth: " + myDate.getUsrDate());
            System.out.println(myDate.getTotalDaysSpent() + " Days Spent on this planet");
            System.out.println( myDate.getTotalWeeksSpent() + " Weeks Spent on this planet");
            System.out.println( myDate.getTotalMonthSpent() + " Months Spent on this planet");
            System.out.println( myDate.getTotalYearSpent() + " Year Spent on this planet");
        }catch (ParseException parseException){
            System.out.println("Wrong Format!");
            System.out.println("Enter DOB In This Format 31/12/2000");
        }catch (Exception exception){
            System.out.println("Something Went Wrong!");
        }
    }
}