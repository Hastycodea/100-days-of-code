import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Day20 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Collections.addAll(hashSet, "andreh", "brian", "kennedy", "junior");
        boolean result = hashSet.contains("bian");
        System.out.println(result);

        // current list
        System.out.println(hashSet.toString());

        hashSet.remove("andreh");
        // deleted item list
        System.out.println(hashSet.toString());

        // number of values(size) in the Set
        System.out.println(hashSet.size());

        // print all values by looping
        hashSet.stream().forEach(System.out::println);

        // removing all values
        hashSet.clear();
        System.out.println("Removed size: " + hashSet.size());
    }
}
