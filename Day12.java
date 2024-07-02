public class Day12 {
    public static void main(String[] args) {
        //  String: Use when you have a fixed sequence of characters.
        //  StringBuilder: Use when you need to modify characters frequently in a single-threaded environment.
        //  StringBuffer: Use when you need to modify characters frequently in a multi-threaded environment.

        StringBuffer value = new StringBuffer("Hello");
        String space = " ";
        String world = "World";

        StringBuilder value2 = new StringBuilder("Hello");
        
        System.out.println("StringBuffer result: " + value.append(space).append(world));
        System.out.println("StringBuilder result: " + value2.append(space).append(world));
        
    }
}
