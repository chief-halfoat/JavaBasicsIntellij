package interviewQuestions.leetCode;

import java.util.Arrays;

/*Incrementing by one gives 4321 + 1 = 4322.
        Thus, the result should be [4,3,2,2].
        Example 3:
        Input: digits = [9]
        Output: [1,0]
        Explanation: The array represents the integer 9.
        Incrementing by one gives 9 + 1 = 10.
        Thus, the result should be [1,0].*/
public class AddOne66A {
    public static void main(String[] args) {
        int[] A = {2,8,7,4};
        int[] B = {1,9,9,9};
        int[] C = {9,9,9};
        int[] D = {1};
        int[] E = {0};
        System.out.println(Arrays.toString(addOne(A)));
        System.out.println(Arrays.toString(addOne(B)));
        System.out.println(Arrays.toString(addOne(C)));
        System.out.println(Arrays.toString(addOne(D)));
        System.out.println(Arrays.toString(addOne(E)));
    }
    public static int[] addOne(int[] num){
        for(int i=num.length-1;i>=0;i--){
            if(num[i]<9){
                num[i]++;
                return num;
            }
            num[i]=0;
        }
        int[] ans = new int[num.length+1];
        ans[0]=1;
        return ans;
    }
}
