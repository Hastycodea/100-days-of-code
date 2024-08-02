package Day40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 3, 5, 11, 16, 2, 17, 89, 87, 4, 10, 11);

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        ExecutorService executor = Executors.newFixedThreadPool(4);

        for(int number : numbers) {
            executor.execute(new PrimeChecker(number, primeNumbers));
        }

        executor.shutdown();

        System.out.println(primeNumbers);
    }

}
