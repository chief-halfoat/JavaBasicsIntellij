package interviewQuestions.hackerrank;

import java.util.*;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        miniMaxSum(arr);
    }

    //2063136757 2744467344
    public static void miniMaxSum(List<Integer> arr) {
        //setting the lar variable to the minimum value for Integer
        long lar =  Integer.MIN_VALUE;
        //setting the sml variable to the maximum value for Integer
        long sml = Integer.MAX_VALUE;
        //setting the sum variable to zero
        long sum = 0;

        //looping through the array
        for(long e : arr){
            //using Math.max to compare the current number in the array to the lar variable
            //Math.max will return the larger of the 2 numbers being compared
            //since lar is set to the minimum value of Integer, it will return the greater value and then set lar to that
            lar = Math.max(e,lar);
            //using Math.min to compare the current number in the array to the lar variable
            //Math.max will return the smaller of the 2 numbers being compared
            //since lar is set to the maximum value of Integer, it will return the smaller value and then set lar to that
            sml = Math.min(e,sml);
            //adding the number from the array to the sum
            sum += e;
        }
        //printing the sum-lar(which is now the greatest number in the array and will give the sum of the four smaller
        //numbers) and sum-sml(which is now the smallest number in the array and will give the sum of the four bigger
        //numbers
        System.out.print((sum - lar) + " " + (sum - sml));

    }
    }

