package interviewQuestions.hackerrank;

import java.util.Arrays;

public class FlippingBits {

    public static long flippingBits(long n) {
        //setting the result to the largest possible number
        long result=4294967295L;
        //subtracting the input number
        result-=n;
        //the difference is the inverse
        return result;
    }
}
