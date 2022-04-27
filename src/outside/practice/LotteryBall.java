package outside.practice;
//Lottery balls numbered from 1 to n are put into a bag.
//Two balls are drawn at random and not replaced.
//What is the probability that the sum of the two numbers is x?

import java.util.ArrayList;
import java.util.List;

public class LotteryBall {
    public static void main(String[] args) {
        System.out.println(probFinder(11,6));
    }
    public static double probFinder(int n, int x){
        double prob = 0;

        List<Integer> allPoss = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            allPoss.add(i);
        }
        double sum=0, count=0;
        for(int i=0;i< allPoss.size();i++){
            for(int j=0;j< allPoss.size();j++){
                if(j==i){
                    continue;
                } else if(allPoss.get(j)+ allPoss.get(i)==6||allPoss.get(j)+ allPoss.get(i)==16){
                    sum++;
                }
                count++;
            }
        }
        prob = (sum/count)*100;
        return prob;
    }
}
