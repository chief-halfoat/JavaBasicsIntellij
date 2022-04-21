package replit;

import org.apache.commons.collections4.list.TreeList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

//Write the logic that picks largest and second largest numbers from a list
// add them and return the results.
// input to method is a list that contains the numbers input [10,20,30,40]
//        output [70]
//        input[5,3,8,9,10,11,5]
//        output [21]
public class Repl222 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(5);
        ints.add(3);
        ints.add(8);
        ints.add(9);
        ints.add(10);
        ints.add(11);
        ints.add(5);

        List<Integer> ints1 = new ArrayList<>();
        ints1.add(10);
        ints1.add(20);
        ints1.add(30);
        ints1.add(40);

        System.out.println(findMaxSum(ints1));
        System.out.println(findMaxSum(ints));
    }

    public static int findMaxSum(List<Integer> list) {
        //sorting the input list
        Collections.sort(list);
        //summing the last 2 values in the sorted list
        int sum = list.get(list.size()-1)+list.get(list.size()-2);
        //returning the sum
        return sum;
    }
}
