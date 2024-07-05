import java.util.ArrayList;

public class Day16 {
    public static void main(String[] args) {

        weekdays[] days = weekdays.values();
        for(weekdays day : days) {
            System.out.println(day);
        }

    }

    public enum weekdays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
}
