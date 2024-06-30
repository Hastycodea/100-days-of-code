public class Day11 {
    public static void main(String[] args) {
        String name = "Andreh Andere Junior ";
        String middleName = "Andere";
        String nameTrim = name.trim();
        String[] parts = name.split(" ");
        String nickName = "Juju";
        
        System.out.println("String length: " + name.length());
        System.out.println("String Concatenation: " + name.concat(nickName));
        System.out.println( "String Comparison" + name.equals(nickName));
        System.out.println("String Case Conversion (upper): " + name.toUpperCase());
        System.out.println("String Case Conversion (upper): " + name.toLowerCase());
        System.out.println("String Trimming: " + nameTrim.length());
        System.out.println("Substring Extraction: " + name.substring(3));
        System.out.println("String Splitting: ");
        for(String part : parts) {
            System.out.println(part);
        }

        System.out.println("String Reversal: ");
        for(int i = middleName.length() - 1; i >= 0; i--) {
            System.out.print(middleName.charAt(i));
        }
        System.out.println();
        System.out.println("String searching: " + name.indexOf(middleName));
        
    }

}
