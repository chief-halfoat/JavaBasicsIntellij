package interviewQuestions.hackerrank;

import java.util.List;

/*
Given an array of integers and a positive integer k, determine the number of (i,j) pairs where i<j  and ar[i]+ar[j] is divisible by k.
Example
ar=[1,2,3,4,5]
k=5
Three pairs meet the criteria: [1,4],[2,3] and [4,6].

Function Description
Complete the divisibleSumPairs function in the editor below.
divisibleSumPairs has the following parameter(s):
int n: the length of array ar
int ar[n]: an array of integers
int k: the integer divisor
Returns
- int: the number of pairs

Input Format
The first line contains 2 space-separated integers, n and k.
The second line contains n space-separated integers, each a value of arr[i].

Constraints
2<=n<=100
1<=k<=100
1<=ar[i]<=100
Sample Input

STDIN           Function
-----           --------
6 3             n = 6, k = 3
1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
Sample Output
 5
 */
public class DivisibleSums {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        //creating the array with size n
        int[] arr = new int[n];
        //instantiating the count at 0
        int count = 0;
        //looping through the list and adding the values to the same locations in the array
        for (int a = 0; a < n; a++) {
            arr[a] = ar.get(a);
        }
        //looping through the array
        //stopping one value shy of the size of the array because we don't need to compare the number to itself
        for (int i = 0; i < n - 1; i++) {
            //looping through the array for the sums
            //j=i+1 so we stay one value ahead and aren't adding the same value to itself
            for (int j = i + 1; j < n; j++) {
                //seeing if it is divisible by the k value
                if ((arr[j] + arr[i]) % k == 0) {
                    //if it is, incrementing the count
                    count++;
                }
            }
        }
        return count;
    }
}
