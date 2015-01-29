/**
 * Created by rari on 28-01-2015.
 */
import java.util.Date;

//library to import for get the date.

public class CurrentDataTime {
    public static void main(String args[]) {
        // Instantiate a Date object
        Date date = new Date();

        String dateTime = String.format("Current Date/Time : %tc", date );

        System.out.printf(dateTime );

    }
}
