package interviewQuestions.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        scores.add(12);
        scores.add(24);
        scores.add(10);
        scores.add(24);
        System.out.println(breakingRecords(scores));
    }
    public static List<Integer> breakingRecords(List<Integer> scores){
        List<Integer> recordsBroken = new ArrayList<>();
        recordsBroken.add(0,0);
        recordsBroken.add(1,0);
        //[12,24,10,24]
        int low=scores.get(0), high=scores.get(0);
        for(Integer score:scores){
            if(low<score){
                low=score;
                recordsBroken.set(1,recordsBroken.get(1)+1);
            } else if(score>high){
                high=score;
                recordsBroken.set(0,recordsBroken.get(0)+1);
            }
        }
        return recordsBroken;
    }
}
