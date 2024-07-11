import java.util.Stack;

public class Day22 {
    public static void main(String[] args) {
        Stack<String> values = new Stack<>();
        values.add("Juju");
        values.add("Kankan");
        values.add("Juma");

        System.out.println(values);

        //removing the top element from the Stack
        System.out.println(values.pop());
        System.out.println(values);

        // printing top element of the Stack without removing from it
        System.out.println(values.peek());
        System.out.println(values);

        // checking if a value exists in the Stack
        System.out.println(values.contains("Juju"));

        // printing size in the Stack
        System.out.println(values.size());
        
        //getting an element from the stack, index method
        System.out.println(values.get(1));
        
        // removing all the values from the Stack
        values.removeAllElements();
        System.out.println(values.size());

    }
}
