package interviewQuestions.leetCode;

import java.util.Arrays;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]
public class TwoSum1 {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
        int[] arr2 = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(arr2, 6)));
    }

    public static int[] twoSum(int[] input, int n) {
        //initialize an int[] for the return
        int[] ans = {0, 0};
        //loop through the input[]
        for (int i = 0; i < input.length; i++) {
            //nested loop
            for (int j = 0; j < input.length; j++) {
                //if j==i, continue, since we cannot add the same int twice
                if (j == i) {
                    continue;
                    //add the array value at j and i and see if it equals n
                } else if (input[j] + input[i] == n) {
                    //if so, compare i and j to see which is greater and assign the values to the answer array
                    if(j>i){
                        ans = new int[]{i, j};
                    } else {
                        ans = new int[]{j,i};
                    }
                }
            }
        }
        return ans;
    }
}