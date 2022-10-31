import javax.xml.crypto.Data;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        new GUI();
        System.out.print("Window Opened at ");
        Date date = new Date();
        System.out.print(date.getHours() + ":");
        System.out.print(date.getMinutes() + ":");
        System.out.print(date.getSeconds()+ " ");
        System.out.print(date.getDate()+ "-");
        System.out.print(1 + date.getMonth() + "-");
        System.out.print(date.getYear());
    }
}