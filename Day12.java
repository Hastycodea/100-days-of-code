public class Day12 {
    public static void main(String[] args) {
        StringBuffer value = new StringBuffer("Hello");
        String space = " ";
        String world = "World";

        StringBuilder value2 = new StringBuilder("Hello");
        
        System.out.println(value.append(space).append(world));
        System.out.println(value2.append(space).append(world));

        
    }
}
