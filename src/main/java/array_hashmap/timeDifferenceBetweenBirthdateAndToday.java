package array_hashmap;
/*
Finding the date difference (year, day, hour, min, sec) between your birthdate and today

*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeDifferenceBetweenBirthdateAndToday  {
    public static void main(String[] args) throws ParseException {
        dateOfDifference();

    }

    public static void dateOfDifference() throws ParseException {
        String thatDay = "14/02/1991 05:12:00 PM";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        Date birthdate = formatter.parse(thatDay);
        Date currentdate = new Date();
        long d = currentdate.getTime() - birthdate.getTime();
        long year = d / (1000l * 60 * 60 * 24 * 365);
        long day = d / (1000 * 60 * 60 * 24) % 365;
        long hour = (d / (1000 * 60 * 60)) % 24;
        long minutes = (d / (1000 * 60)) % 60;
        long second = (d / 1000) % 60;

        System.out.println("Year " + year);
        System.out.println("Day " + day);
        System.out.println("Hour " + hour);
        System.out.println("Minute " + minutes);
        System.out.println("Second " + second);

    }
}
