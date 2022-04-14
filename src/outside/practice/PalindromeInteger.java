package outside.practice;
//This is generally asked as follow-up or alternative of the previous program.
// This time you need to check if given Integer is palindrome or not.
// An integer is called palindrome if it's equal to its reverse,
// e.g. 1001 is a palindrome, but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234.
// You can use divide by 10 to reduce the number and modulus 10 to get the last digit.
// This trick is used to solve this problem.
public class PalindromeInteger {
    public static void main(String[] args) {
        isIntPalindrome(123);
        isIntPalindrome(12321);
    }

    public static void isIntPalindrome(int n){
        int r, sum=0, temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum){
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not Palindrome!");
        }
    }
}
