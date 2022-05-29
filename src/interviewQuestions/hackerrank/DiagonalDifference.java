package interviewQuestions.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    /*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> line1 = new ArrayList<>();
        List<Integer> line2 = new ArrayList<>();
        List<Integer> line3 = new ArrayList<>();
        line1.add(1);
        line1.add(2);
        line1.add(3);
        line2.add(4);
        line2.add(5);
        line2.add(6);
        line3.add(9);
        line3.add(8);
        line3.add(9);
        arr.add(line1);
        arr.add(line2);
        arr.add(line3);
        System.out.println(arr);
//        System.out.println(arr.size());
        System.out.println(diagonalDifference(arr));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
    int absoluteDiff = 0;

    int leftToRight=0, rightToLeft=0;
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> temp = arr.get(i);
            leftToRight=leftToRight+temp.get(i);
        }
        for(int j=arr.size()-1,i=0;j>=0&&i<arr.size();j--,i++){
            List<Integer> temp = arr.get(i);
            rightToLeft=rightToLeft+ temp.get(j);
        }
        absoluteDiff=(leftToRight-rightToLeft);
        if(absoluteDiff<0){
            absoluteDiff*=-1;
        }

    return absoluteDiff;
    }

}
