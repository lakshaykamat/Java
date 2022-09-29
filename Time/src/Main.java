import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        String now = calendar.get(Calendar.DATE) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.YEAR);
        System.out.println(now);
        String str1 = "27/09/2022 18:30:00";
        String  str2 = "06/09/2022 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy hh:mm:ss");
        Date d1 = sdf.parse(str1);
        Date d2 = sdf.parse(str2);
        long diff = d1.getTime() - d2.getTime();

        int second = 1000;//1 second has 1000 milliseconds
        int minute = second * 60;// converting minute to milliseconds
        int hour = minute * 60;//converting hour to milliseconds
        int day = hour * 24; //converting day to milliseconds

        System.out.print("Days " + diff/day);
        System.out.print(" Hours " + (diff % day)/hour);
        System.out.print(" Minute " + (diff % hour) / minute);
        System.out.print(" Seconds " + (diff % minute) / second);
    }
}