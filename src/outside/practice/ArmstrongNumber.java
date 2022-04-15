package outside.practice;
//A number is called an Armstrong number if it is equal to the cube of its every digit.
// For example, 153 is an Armstrong number because of 153= 1+ 125+27,
// which is equal to 1^3+5^3+3^3.
// You need to write a program to check if the given number is Armstrong number or not.
public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println(isArmstrong(123));
        System.out.println(isArmstrong(153));

    }
   public static boolean isArmstrong(int n){
        int pop, sum=0, orig=n;
        while (n!=0){
            pop=n%10;
            n/=10;
            sum= (int) (sum+(Math.pow(pop,3)));
        }
        if(orig==sum){
            return true;
        } else {
            return false;
        }
   }
}
