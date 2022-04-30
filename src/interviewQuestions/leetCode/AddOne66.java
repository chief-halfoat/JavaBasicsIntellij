package interviewQuestions.leetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

/*You are given a large integer represented as an integer array digits,
where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].*/
public class AddOne66 {
    public static void main(String[] args) {
        int[] arr = {2,9};
        System.out.println(Arrays.toString(addOne(arr)));
    }
    public static int[] addOne(int[] digits){
//        int base = arr[0];
//        for(int i=1;i<arr.length;i++){
//            base=base*10+arr[i];
//        }
//        base+=1;
//        String str = Integer.toString(base);
//        int[] sum = new int[str.length()];
//        for(int i=0; i<str.length();i++){
//            sum[i] = Character.getNumericValue(str.charAt(i));
//        }
//        return sum;

        //getting the length of the input array
        int n = digits.length;
        //looping through the array starting at the end
        for(int i=n-1; i>=0; i--) {
            //if the last digit is less than 9
            if(digits[i] < 9) {
                //increment the digit
                digits[i]++;
                //return the incremented array
                return digits;
            }
            //if the last digit is 9, the last digit is set to 0 and the loop goes on. Because it acts like a carryover,
            //the next digit would get incremented with a 1
            digits[i] = 0;
        }
        //only exists for edge cases like all 9s

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }
//    public static int[] addOneA(int[] arr){
//        int base = arr[0];
//        for(int i=1;i<arr.length;i++){
//            base=base*10+arr[i];
//        }
//        base+=1;
//
//        if(arr[arr.length-1]==9){
//            int[] sum = new int[arr.length+1];
//            } else {
//            int[] sum = new int [arr.length];
//        }
//        for (int i = sum.length-1;i>=0;i--){
//            sum[i] = base%10;
//        }
//        return sum;
//}
}
