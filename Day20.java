import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Day20 {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        Collections.addAll(treeSet, "juxta", "zodiac", "aaty");
        System.out.println(treeSet.toString());


        Set<String> hashSet = new HashSet<>();
        Collections.addAll(hashSet, "andreh", "brian", "junior", "kennedy", "junior");
        
        // current list
        System.out.println(hashSet.toString());
        
        boolean result = hashSet.contains("bian");
        System.out.println(result);

        // deleted item list
        hashSet.remove("andreh");
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
