import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class MyDate {
    Date usrDate,currentDate;
    long usrDateMilliSecond,currentDateMilliSecond;
    int totalDaysSpent, totalWeeksSpent, totalMonthSpent, totalYearSpent;
    MyDate(String usrDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("d/M/yyy");//Formatter of String to Date
       Date formatDate = formatter.parse(usrDate);//Giving String to formatter
       this.usrDateMilliSecond =  formatDate.getTime();//converting usr time into milliseconds
       this.usrDate = formatDate;//storing usr given time

        currentDatesAndMilliSecond();//Current Date and Millisecond of current date
        totalTimeSpent(getCurrentDateMilliSecond(),getUsrDateMilliSecond());
    }
    public void currentDatesAndMilliSecond(){
        Calendar cal = Calendar.getInstance();
        int year  = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int date  = cal.get(Calendar.DATE);
        cal.clear();
        cal.set(year, month, date);
        this.currentDate = cal.getTime();//current time
        this.currentDateMilliSecond = cal.getTimeInMillis();//current time in milliseconds
    }
    public void totalTimeSpent(long currentDateMilliSecond,long usrDateMilliSecond){
        int second = 1000;//1 second has 1000 milliseconds
        int minute = second * 60; // converting minute to milliseconds
        int hour = minute * 60; //converting hour to milliseconds
        int day = hour * 24;//converting day to milliseconds
        long weeks = day * 7;//converting weeks to milliseconds
        long month = (long) (weeks * 4.34524); //converting months to milliseconds
        double year = month * 12L; //year to milliseconds
        long gap = currentDateMilliSecond - usrDateMilliSecond;//the difference
        this.totalDaysSpent = (int) (gap/day);
        this.totalWeeksSpent = (int) (gap/weeks);
        this.totalMonthSpent = (int) (gap/month);
        this.totalYearSpent = (int) (gap/year);
    }
    public Date getCurrentDate(){
        return currentDate;
    }
    public Date getUsrDate(){
        return usrDate;
    }
    public long getCurrentDateMilliSecond(){
        return currentDateMilliSecond;
    }
    public long getUsrDateMilliSecond(){
        return usrDateMilliSecond;
    }
    public int getTotalDaysSpent(){return totalDaysSpent;}
    public int getTotalWeeksSpent(){return totalWeeksSpent;}
    public int getTotalMonthSpent(){return totalMonthSpent;}
    public int getTotalYearSpent(){return totalYearSpent;}
}
