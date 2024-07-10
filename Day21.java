import java.util.HashMap;

public class Day21 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(8978, "Andere");
        students.put(4362, "JadaK");
        students.put(1119, "Musyoks");
        students.put(8778, "Barring");

        // Accessing items using get()
        System.out.println(students.get(1119));

        // Checking if a key exists in hMap
        int keyNumber = 1119;
        if (students.containsKey(keyNumber)) {
            System.out.println("Bingo! " + keyNumber + " found");
        } else {
            System.out.println("Sorry, " + keyNumber + " not found");
        }

        // Removing an item from the hashMap
        students.remove(8778);
        System.out.println(students.toString());

        // Printing number of elements(size) in the HashMap
        System.out.println(students.size());

        // Printing students name one by one by looping, using keySet()
        for (int key : students.keySet()) {
            System.out.println(students.get(key));
        }

        // Printing students name one by one by looping, using entrySet()
        System.out.println("Using entrySet()");
        students.entrySet().forEach(n -> System.out.println(n.getValue()));

        // Printing the keys
        students.entrySet().forEach(n -> System.out.println(n.getKey()));
        
        // Using a forLoop
        for(int key : students.keySet()) {
            System.out.println(key);
        }

    }
}
