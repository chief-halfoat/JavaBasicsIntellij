package interviewQuestions.leetCode;

public class PalindromeNumber9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        String input = String.valueOf(x);
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        String rev = sb.toString();
        return input.equals(rev);
    }
}
