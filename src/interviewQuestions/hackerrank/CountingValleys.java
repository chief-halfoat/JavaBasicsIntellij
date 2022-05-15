package interviewQuestions.hackerrank;

import java.util.Arrays;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        //instantiating the position variable and the valley count to 0
        int pos =0, valleys=0;
        //looping through the path string
        for (int i = 0; i < path.length(); i++) {
            //if the step is an Up step, increment the position
            if(path.charAt(i)=='U'){
                pos++;
            //if the step is a Down step:
            }else if (path.charAt(i)=='D'){
                //check if the level was at 0, if so increment the valleys count
                if(pos==0){
                    valleys++;
                }
                //decrement the position
                pos--;
            }
        }
        return valleys;
    }
}
