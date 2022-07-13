package interviewQuestions.leetCode;

/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21
 */
public class ReverseInteger07 {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }

    public static int reverse2(int x){

        //creating a result int and setting it to zero
        int result = 0;
        //creating a while loop that will run until x is 0, which allows both a positive int and a negative int to be
        //decimated while allowing the loop to run
        while (x != 0) {
            //creating an int that will return the last digit of an int
            int tail = x % 10;
            //creating a placeholder result and setting it equal to the current result, which is multiplied by 10
            //and the current last digit of the int is added
            int newResult = result * 10 + tail;
                //if the placeholder is not equal to the current result, less the tail, divided by 10, it means that the
                //operations we've performed have taken the number outside the bounds of the int
                if ((newResult - tail) / 10 != result) {
                //therefore, we return 0
                return 0;
                 }
            //however, if they do match,the result is set to the placeholder
            result = newResult;
            //the int is decimated
            x = x / 10;
        }
        //once the int is 0, the loop has finished running and we can return the reversed int
        return result;
    }
    public static int reverse(int x) {
        //fails on edge cases
        int rev = 0;
        int n = Integer.MAX_VALUE;
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            rev = 0;
        } else {
            while (x != 0) {
                rev = rev*10+(x%10);
                if (x == 0) {
                    rev /= 10;
                }
                if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
                    rev = 0;
                }
                x /= 10;
            }
        }
        return rev;
    }
}
