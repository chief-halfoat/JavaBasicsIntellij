package outside.practice;
//You need to write a simple Java program to check
// if a given String is palindrome or not.
// A Palindrome is a String which is equal to the reverse of itself,
// e.g., "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."
// Though be prepared with both recursive and iterative solution of this problem.
// The interviewer may ask you to solve without using any library method, e.g. indexOf() or subString() so be prepared for that.
public class PalindromeString {
    public static void main(String[] args) {
        isPalindromeLoop("Race car");
        isPalindromeLoop("Able was I ere I saw Elba");

        isPalindromeStringMethods("racecar");
        isPalindromeStringMethods("Racecar");
        isPalindromeStringMethods("race car");


    }
    public static void isPalindromeLoop (String input){
        String reverse = "";
        String inputNoSpaces = input.replace(" ","").toLowerCase();
        for (int i = inputNoSpaces.length()-1; i >= 0; i--) {
            reverse+=inputNoSpaces.charAt(i);
        }
        if(inputNoSpaces.equals(reverse)){
            System.out.println(input+" is a palindrome!");
        } else{
            System.out.println(input+" is not a palindrome!");
        }
    }

    public static void isPalindromeStringMethods(String input){
        input = input.replace(" ","").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        String reverse = stringBuilder.toString();
        if(input.equals(reverse)){
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome!");
        }
    }
}
