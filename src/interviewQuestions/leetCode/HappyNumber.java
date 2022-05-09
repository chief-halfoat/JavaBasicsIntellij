package interviewQuestions.leetCode;

import java.util.HashSet;
import java.util.Set;

/*Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay),
 or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:
Input: n = 2
Output: false

Constraints:
1 <= n <= 231 - 1*/
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(1));
    }
    public static boolean isHappy(int n) {
        //creating a set
        Set<Integer> set = new HashSet<>();
        //setting up a sum and a remainder
        int sum, remainder;
        //creating a while loop to add n to the set
        //if the n has already been added to the set,
          //it can't be added again, since sets don't hold duplicates
          // and then we don't have to continue checking and we avoid inifity
        while (set.add(n)) {
            //resetting the sum to 0
            sum = 0;
            //nesting a while loop
            while (n > 0) {
                //getting the last digit of the number
                remainder = n % 10;
                //adding the square of the digit to the sum
                sum += remainder * remainder;
                //reducing the number by the last digit
                n /= 10;
            }
            //if the sum equals 1, break the loop
            if (sum == 1) {
                return true;
                //else restart the loop with the sum
            } else {
                n = sum;
            }
        }
        return false;

    }
}
