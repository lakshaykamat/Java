import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args){
        final int seconds = 1000;
        final int minute = seconds * 60;
        final int hour = minute * 60;
        final int day = hour * 24;
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
    }
}
