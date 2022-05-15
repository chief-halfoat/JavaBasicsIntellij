package interviewQuestions.hackerrank;

import org.apache.commons.collections4.list.TreeList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSort1 {

    public static int[] countingSort(List<Integer> arr) {
        TreeList<Integer> sorted = new TreeList<>(arr);
        int[] count = new int[sorted.get(sorted.size()-1)];

        for(Integer num:arr){
            count[num-1]+=1;
        }


        return count;
    }
}
