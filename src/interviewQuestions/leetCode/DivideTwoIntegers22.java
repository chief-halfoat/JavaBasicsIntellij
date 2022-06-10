package interviewQuestions.leetCode;

public class DivideTwoIntegers22 {
    public static void main(String[] args) {
        System.out.println(divide(7,-3));
    }
    public static int divide(int dividend, int divisor) {
        int count = 0;
        int temp = divisor;
        if(temp<0){
            divisor*=-1;
        }
        while(dividend>0+divisor){
            dividend-=divisor;
            count++;
        }
        if(temp<0){
            count*=-1;
        }
        return count;
    }
}
