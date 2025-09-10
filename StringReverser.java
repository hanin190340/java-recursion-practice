//task2
public class StringReverser {

    public static void main(String[] args) {

        String original = "Hello World";
        String reversed = reverseStringRecursive(original);

        System.out.println("Reversing string using a Recursive...");
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseStringRecursive(String str) {
        if (str.equals("") || str.isEmpty() || str.length() <= 1) {
            return str; // base case
        }
        return reverseStringRecursive(str.substring(1)) + str.charAt(0);
    }

}