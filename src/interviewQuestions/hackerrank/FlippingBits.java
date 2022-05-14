package interviewQuestions.hackerrank;

import java.util.Arrays;

public class FlippingBits {

    public static void main(String[] args) {
        System.out.println(flippingBits(1));
    }
    public static long flippingBits(long n) {

        String bits = Long.toBinaryString(n);
        char[] arr = bits.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == '0'){
                arr[i]='1';
            } else if (arr[i]=='1'){
                arr[i]='0';
            }
        }
        bits = Arrays.toString(arr).replaceAll("\\[", "").replaceAll("\\]","");
        n=Long.parseLong(bits);
        return n;
    }

}
