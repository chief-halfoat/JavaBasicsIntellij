package interviewQuestions.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> matches = new ArrayList<>();

        int hold = 0;
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < queries.size(); j++) {
                if (queries.get(j).equals(strings.get(i))){
                    matches.add(hold,matches.get(hold)+1);
                }
            }
            hold++;
        }


        return matches;
    }
}
