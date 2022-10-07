import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MyTime {
    Date currentDate,usrDate;
    long currentDateMilliSecond,usrDateMillisecond;

    ArrayList<Integer> integerArrayList = new ArrayList<>();
    ArrayList<Double> doubleArrayList = new ArrayList<>();

    public void currentDatesAndMilliSecond(){
        this.currentDate = new Date();
        this.currentDateMilliSecond = new Date().getTime();
    }
    public void pareUsrTime(String usrTime) throws ParseException, InvaildUsrDateException {
        SimpleDateFormat formatter = new SimpleDateFormat("d/M/yyyy hh:mm:ss");
        this.usrDate = formatter.parse(usrTime);
        this.usrDateMillisecond = this.usrDate.getTime();
        difference(getCurrentDateMilliSecond(),getUsrDateMilliSeconds());
    }
    public void difference(long currentDateMilliSecond,long usrDateMillisecond) throws InvaildUsrDateException {
        long difference = currentDateMilliSecond - usrDateMillisecond;
        checkUserDate(difference);
        final int seconds = 1000;
        final int minutes = seconds * 60;
        final int hours = minutes * 60;
        final int day = hours * 24;
        final double week = day * 7;
        final double month = week * 4.34524;
        this.integerArrayList.add((int) (difference/day));//Days Stored
        this.integerArrayList.add((int) ((difference%day)/hours));//Hours stored
        this.integerArrayList.add((int) ((difference%hours)/minutes));//Minutes Stored
        this.integerArrayList.add((int) ((difference%minutes)/seconds));//Seconds Stored

        DecimalFormat numberFormat = new DecimalFormat("#.00");//Decimal formatter
        this.doubleArrayList.add(Double.valueOf(numberFormat.format(difference/week)));//formatting week and storing
        this.doubleArrayList.add(Double.valueOf(numberFormat.format(difference/month)));//storing months
    }

    public static void checkUserDate(long mill) throws InvaildUsrDateException {
        if(mill<0){
            throw new InvaildUsrDateException();
        }
    }
    public Date getCurrentDate() {return currentDate;}
    public Date getUsrDate(){return usrDate;}
    public long getCurrentDateMilliSecond(){return currentDateMilliSecond;}

    public long getUsrDateMilliSeconds(){return usrDateMillisecond;}
    public ArrayList<Integer> getIntegerArrayList(){return integerArrayList;}
    public ArrayList<Double> getDoubleArrayList(){return doubleArrayList;}
}
