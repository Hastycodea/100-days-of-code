import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        ArrayList<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        // Printing all elements in the array
        System.out.println("Printing all elements in the Array");
        weekdays.stream().forEach(day -> System.out.println(day));
        System.out.println();

        // Removing days starting with char "character"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character to remove from the list: ");
        char input = scanner.nextLine().charAt(0);
        System.out.println("Here's the new list");
        removesChar(weekdays, input);
        weekdays.stream().forEach(day -> System.out.println(day));

        // Sorting elements alphabetically
        System.out.println("Sorting elements alphabetically");
        weekdays.stream().sorted().forEach(day -> System.out.println(day));
        System.out.println();

        // Sorting elements in decreasing order alphabetically
        System.out.println("Sorting elements in decreasing order alphabetically");
        Collections.sort(weekdays, (String d1, String d2) -> {
            return d2.compareTo(d1);
        });
        weekdays.stream().forEach(day -> System.out.println(day));

    }

    public static ArrayList<String> removesChar(ArrayList<String> array, char myChar) {
        Iterator<String> iterator = array.iterator();
        while (iterator.hasNext()) {
            char elementChar = iterator.next().charAt(0);
            if (elementChar == myChar) {
                iterator.remove();
            }
        }

        return array;

    }
}
