package interviewQuestions.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order, and each of their nodes contains a single digit.
// Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//Example 1:
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//Example 2:
//Input: l1 = [0], l2 = [0]
//Output: [0]
//Example 3:
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]
public class AddTwoNumbers02 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(2,4,3);
        List<Integer> l2 = Arrays.asList(5,6,4);
        List<Integer> l3 = Arrays.asList(0);
        List<Integer> l4 = Arrays.asList(0);
        List<Integer> l5 = Arrays.asList(9,9,9,9,9,9,9);
        List<Integer> l6 = Arrays.asList(9,9,9,9);

        System.out.println("l1 = "+l1+" l2 = "+l2+" addTwoNumbers = "+addTwoNumbers(l1,l2));
        System.out.println("l3 = "+l3+" l4 = "+l4+" addTwoNumbers = "+addTwoNumbers(l3,l4));
        System.out.println("l5 = "+l5+" l6 = "+l6+" addTwoNumbers = "+addTwoNumbers(l5,l6));
    }
    public static List<Integer> addTwoNumbers(List<Integer> a, List<Integer> b){
        List<Integer> sum = new ArrayList<>();
        int n1=0, n2=0;
        for(int i=a.size()-1; i>=0;i--){
            int dig = a.get(i);
            n1 +=dig;
            if(i!=0){
                n1*=10;
                continue;
            }
        }
        for(int i=b.size()-1; i>=0;i--){
            int dig = b.get(i);
            n2 +=dig;
            if(i!=0){
                n2*=10;
                continue;
            }
        }
        int sum1 = n1+n2;
        while(sum1>-0){
            int n =sum1%10;
            sum.add(n);
            sum1/=10;
        }
        if(sum.isEmpty()){
            sum.add(0);
        }

        return sum;
    }

}
