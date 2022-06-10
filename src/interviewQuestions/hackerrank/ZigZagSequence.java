package interviewQuestions.hackerrank;

import java.util.Arrays;

public class ZigZagSequence {

    public static void findZigZagSequence(int [] a, int n){
        //sort the array in natural order
        Arrays.sort(a);
        //instantiate an int to find index of the middle value (or the rounded down middle in event of an odd length)
        int mid = n/2;
        //instantiate an int to hold the value at the middle index
        int temp = a[mid];
        //reassign the middle index to the value of the last index of the sorted array
        a[mid] = a[n - 1];
        //reassign the last index to the held middle value
        a[n - 1] = temp;

        //instantiate an int of the middle index+1
        int st = mid + 1;
        //instantiate an int of the last index
        int ed = n - 2;
        //while the mid+1 index is <= the end index
        while(st <= ed){
            //temp hold the value at st
            temp = a[st];
            //set the value of the sorted array at index[st] to the value at index[ed]
            a[st] = a[ed];
            //set the value of the sorted array at index[ed] to the temp held value
            a[ed] = temp;
            //increment the st value
            st = st + 1;
            //decrement the ed value
            ed = ed - 1;
        }
        //print the array
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
