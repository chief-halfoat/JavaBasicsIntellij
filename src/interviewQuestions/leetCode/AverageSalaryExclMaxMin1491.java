package interviewQuestions.leetCode;

import java.util.Arrays;

public class AverageSalaryExclMaxMin1491 {

    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
        double sum =0;
        Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++){
            sum+=salary[i];
        }
        return sum/(salary.length-2);
    }
}
