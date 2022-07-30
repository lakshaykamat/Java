import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Reference Data Types
        Date now  = new Date();
        //This is how you initlize Reference data types
        long time = now.getTime();
        //this is how you accses a members of the class
        System.out.println(now);
        System.out.println(time);
    }
}
