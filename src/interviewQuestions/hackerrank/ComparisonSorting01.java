package interviewQuestions.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparisonSorting01 {

    public static List<Integer> countingSort(List<Integer> arr) {

        Collections.sort(arr);
        List<Integer> counts = new ArrayList<>();
        for(int i=0;i<100;i++){
            counts.add(i,0);
        }
        for(Integer num:arr){
            counts.set(num,counts.get(num)+1);
        }
        return counts;
    }
}
