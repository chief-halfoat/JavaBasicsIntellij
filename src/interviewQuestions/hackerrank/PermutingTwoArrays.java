package interviewQuestions.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class PermutingTwoArrays {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        A.add(2);
        A.add(1);
        A.add(3);
        B.add(7);
        B.add(8);
        B.add(9);

        System.out.println(twoArrays(10,A,B));
    }
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        //Sort A and B in natural order
        Collections.sort(A);
        Collections.sort(B);
        //loop through A' and B', A' forwards and B' backwards
        for(int i=0, j=A.size()-1;i<A.size();i++,j--){
            //add A(i)+B(i)
            //if it is less than k, it fails the req
            if(A.get(i)+B.get(j)<k){
                return "NO";
            }
        }
        return "YES";

}
}
