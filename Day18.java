import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a sentence: ");
        // String sentence = scanner.nextLine();
        // System.out.print("Number of vowels: " + numberOfVowels(sentence));
        // System.out.println();

        //Checking prime
        System.out.println("Checking Prime");
        System.out.print("Enter a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Is prime: " + isPrime(number));
    }

    public static boolean isPrime(int number) {
        if(number < 2) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int numberOfVowels(String sentence) {
        String[] partsOfSentence = sentence.split("");
        int sum = 0;
        String[] vowels = {"a", "e", "i", "o", "u" };
        for (int i = 0; i < partsOfSentence.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (partsOfSentence[i].equalsIgnoreCase(vowels[j])) {
                    sum++;
                }
            }

        }

        return sum;
    }

}
