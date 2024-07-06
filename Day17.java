import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Day17 {
    public static void main(String[] args) {
        // Initializing current date as value
        Date currentDate = new Date();
        System.out.println(currentDate);

        // Printing epoch time => 00:00:00
        SimpleDateFormat epochTime = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Epoch Time => " + epochTime.format(currentDate));

        // Initialising a date variable with the date 7 days before current day
        LocalDate  now = LocalDate.now();
        LocalDate dateBefore7Days = now.minusDays(7);
        System.out.println(dateBefore7Days);

        // Comparing 2 dates with before, after, and compareTo
        System.out.println(now.compareTo(dateBefore7Days));

        System.out.println(now.isAfter(dateBefore7Days));

        System.out.println(now.isBefore(dateBefore7Days));

        // Current date in GMT, CST, IST
        System.out.println("Current date in GMT, CST, IST");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        
        ZonedDateTime gmtDateTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println(gmtDateTime.format(formatter));

        ZonedDateTime cstDateTime = ZonedDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println(cstDateTime.format(formatter));

        ZonedDateTime istDateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(istDateTime.format(formatter));



    }
}
