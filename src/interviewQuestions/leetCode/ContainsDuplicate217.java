package interviewQuestions.leetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num,counts.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry:counts.entrySet()){
            if(entry.getValue()>1){
                return true;
            }
        }
        return false;
    }
}
