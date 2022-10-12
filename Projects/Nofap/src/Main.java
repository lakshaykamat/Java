import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Date (dd/mm/yyy): ");
        String usrDate = scanner.next();

        System.out.print("Enter Time (hh:mm:ss): ");
        String usrTime = scanner.next();

        String usrDateTime = usrDate +" "+ usrTime;
        try {
            MyTime myTime = new MyTime();
            myTime.currentDatesAndMilliSecond();
            myTime.pareUsrTime(usrDateTime);

            System.out.println("Current Date & Time: " + myTime.getCurrentDate());
            System.out.println("Your Date & Time: " + myTime.getUsrDate());

            ArrayList<Integer> integerArrayList = myTime.getIntegerArrayList();//Integer Array
            ArrayList<Double> doubleArrayList = myTime.getDoubleArrayList();//Double Array
            System.out.print("It Has Been ");
            System.out.print(integerArrayList.get(0) + " Days ");
            System.out.print(integerArrayList.get(1) + " Hours ");
            System.out.print(integerArrayList.get(2) + " Minutes ");
            System.out.println(integerArrayList.get(3) + " Seconds ");
            System.out.println(doubleArrayList.get(0) + " Weeks");
            System.out.println(doubleArrayList.get(1) + " Months");
        }catch (ParseException parseException){
            System.out.println("Wrong Format! :(");
        }catch (InvaildUsrDateException invaildUsrDateException) {
            System.out.println("You Entered Future Date! :X");
        }catch(Exception e){
            System.out.println("Something Went Wrong :(");
        }
    }
}