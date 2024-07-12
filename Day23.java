import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Day23 {
    public static void main(String[] args) {
        Queue<String> guests = new LinkedList<>();
        Collections.addAll(guests, "Kim", "Andreh", "Tony");
        System.out.println(guests);

        // Removing the head element in the Queue
        guests.poll();
        System.out.println(guests);

        // Printing the first element of the Queue without removing it
        System.out.println(guests.peek());
        System.out.println(guests);

        // Checking if a value exists
        if (guests.contains("Andreh")) {
            System.out.println("Andreh found!");
        } else {
            System.out.println("No such word");
        }

        // Printing Queue size
        System.out.println(guests.size());

        // Removing all values from the Queue
        guests.removeAll(guests);
        System.out.println(guests);
    }
}
