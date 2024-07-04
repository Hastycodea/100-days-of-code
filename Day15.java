import java.util.ArrayList;
import java.util.Collections;
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

        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character to remove from the list: ");
        String input = scanner.nextLine();
        System.out.println("Here's the new list");
        System.out.println(removesChar(weekdays, input).size());
        // removedChar.stream().forEach(day -> System.out.println(day));
    }

    public static ArrayList<String> removesChar(ArrayList<String> array, String character) {
        for(String element : array) {
            if (element.contains(character)) {
                array.remove(element);                
            }
        }
        return array;
    }
}
