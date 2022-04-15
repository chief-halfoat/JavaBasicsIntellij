package outside.practice;

import java.util.Scanner;

public class ArmstrongNumberImproved {

    public static void main(String[] args) {
        //getting number to check
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        //getting the sum of the digits of the input number to the power of the number of digits
        double sum = requiredSum(num);
        //comparing the sum of the digits raised to the power of the number of digits to the original number
        if(num==sum){
            System.out.println(num+" is a Narcissistic number!");
        }else {
            System.out.println(num+" is NOT a Narcissistic number");
        }
    }

    public static int noOfDigits (int num) {
        int i;
        //using a loop to find how many digits are in the number
        //i is 0, but it relies on the number being greater than zero.
        //the loop divides the number by 10, which eliminates the last digit (and since it is an int, it doesn't store
        //a remainder or decimal. Then the number is updated to the new shorter number. This loop continues until the
        //number is 0. Then, the method returns the i, since i counted up every iteration of the loop. This shows how
        //many digits are in the number
        for (i = 0; num>0; i++){
            num/=10;
        }
        return i;
    }

    public static double requiredSum (int num){
        //get number of digits
        int i=noOfDigits(num);
        double sum = 0;
        //instaniate a sum
        while (num!=0){
            //a temp pop is set to the number mod 10. This assigns pop to the value of the last digit, since mod10 will
            //give you a remainder of that digit
            int pop = num%10;
            //taking the num and dividing it by 10. Since it is an int, this essentially deletes the last digit, which
            //is now stored in the pop
            num=num/10;
            //the sum is now getting the pop digit raised to the power of the number of digits in the original number
            sum+= Math.pow(pop,i);
            //the loop continues until the every digit has been powered and added to the sum
        }
        return sum;
    }
}


