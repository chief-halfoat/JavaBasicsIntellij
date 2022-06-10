package interviewQuestions.leetCode;

public class SubtractProdSumDigitsInt1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));

    }
    public static int subtractProductAndSum(int n) {
        int sum=0,prod=1;
        String temp = ""+n;
        char[] arr = temp.toCharArray();
        for(char ch:arr){
            int i = Character.getNumericValue(ch);
            sum+=i;
            prod*=i;
        }
        return prod-sum;
    }
}
