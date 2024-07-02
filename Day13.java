public class Day13 {
    public static void main(String[] args) {
        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum * 1.0 / numbers.length;
        System.out.println("Average of numbers: " + average);

        // cloning
        int[] numbers2 = numbers.clone();
        int lastNumber = numbers2[numbers2.length - 1];
        System.out.println(lastNumber);

        // creating an array of the same length
        int[] newArray = new int[numbers.length];

        // copying elements to newArray
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }

        // printing copied elements
        System.out.println("Copied Elements");
        for (int i = 0; i < newArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(newArray[i]);
        }
    }
}
