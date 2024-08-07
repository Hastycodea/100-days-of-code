package Day39;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //filter operation
        ArrayList<String> listStrings = new ArrayList<>();
        Collections.addAll(listStrings, "Kan", "Job", "Kim", "Shadrack");
        listStrings.stream().filter(n -> n.startsWith("K")).forEach(System.out::println);

        //square of numbers
        ArrayList<Integer> listIntegers = new ArrayList<>();
        Collections.addAll(listIntegers, 4, 8, 9, 10, 20, 3);
        listIntegers.stream().map(n -> n * n).forEach(System.out::println);

        System.out.println();
        System.out.println("Prime numbers");
        //finding prime numbers
        ArrayList<Integer> findPrime = new ArrayList<>();
        Collections.addAll(findPrime, 1, 2, 3, 5, 4, 9, 8, 12, 11, 17, -3);
        findPrime.parallelStream().filter(Main::isPrime).forEach(System.out::println);
        System.out.println();
        
        //filtering students with >3 grade
        HashMap<String, Integer> students = new HashMap<>();
        try {
            Scanner scanner = new Scanner(new File("Students.csv"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineParts = line.split(",");
                String name = lineParts[0];
                int grade = Integer.valueOf(lineParts[1]);
                students.put(name, grade);

            }
            
        } catch (Exception e) {
            System.out.println("Exception: " +e.getMessage());
        }

        students.entrySet().stream()
        .filter(n -> n.getValue() > 3)
        .forEach(n -> System.out.println(n.getKey() + ":" + n.getValue()));

    }

    public static boolean isPrime(int number) {
        if(number == 0 || number == 1) return false;
        for(int i = 2; i <=Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
