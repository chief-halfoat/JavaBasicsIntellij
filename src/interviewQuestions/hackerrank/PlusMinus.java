package interviewQuestions.hackerrank;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int pos=0,zero=0,neg=0;
        for(Integer num:arr){
            if(num>0){
                pos+=1;
            } else if (num<0){
                neg+=1;
            } else if (num==0){
                zero+=1;
            }}
        double posRatio=pos/arr.size();
        double negRatio=neg/arr.size();
        double zeroRatio=zero/arr.size();

        DecimalFormat df= new DecimalFormat("#.000000");
        System.out.println(posRatio);
        System.out.println(df.format(negRatio));
        System.out.println(df.format(zeroRatio));
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int N=Integer.parseInt(scan.nextLine());
        int arr[]= new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=scan.nextInt();
        }
        scan.close();
        double pos=0;
        double neg=0;
        double zero=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i]>0)
            {
                pos=pos+1;
            }
            else if(arr[i]<0)
            {
                neg=neg+1;
            }
            else
            {
                zero=zero+1;
            }
        }
        DecimalFormat df= new DecimalFormat("#.000");
        System.out.println(df.format(pos/N));
        System.out.println(df.format(neg/N));
        System.out.println(df.format(zero/N));
    }
}
