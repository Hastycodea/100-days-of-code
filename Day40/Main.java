package Day40;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 3, 5, 11, 16, 2, 17, 89, 87, 4, 10, 11);

        numbers.stream().filter(Main::isPrime).forEach(System.out::println);
    }
    public static boolean isPrime(int number) {
        if (number == 0 || number == 1) return false;
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
