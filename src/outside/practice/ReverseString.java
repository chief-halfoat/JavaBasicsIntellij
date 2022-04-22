package outside.practice;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseStringRecursive("bubble"));
    }
    public static String reverseStringRecursive(String input){
        if (input.length() < 2) {
            return input;
        }
        return reverseStringRecursive(input.substring(1)) + input.charAt(0);

    }
}
