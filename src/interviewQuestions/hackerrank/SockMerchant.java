package interviewQuestions.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchant {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);
        System.out.println(sockMerchant(9, ar));

    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // instantiating the count of pairs
        int count =0;
        //creating a map to store number of each color sock
        Map<Integer,Integer> counts = new HashMap<>();
        //looping through the list of socks
        for (Integer num:ar){
            //putting the count of socks into the map with the color
            counts.put(num, counts.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:counts.entrySet()){
            //if the count is greater than 2, we have at least one pair of that color socks
            if(entry.getValue()>=2){
                //temp storing the value
                int p = entry.getValue();
                //getting the modulo of the count and 2 and subtracting it, as it will be either 1 or 0
                //this will remove the possible odd sock
                p-=p%2;
                //dividing by 2 to get the amount of pairs
                p/=2;
                //incrementing the count by number of pairs
                count += p;
             }
        }
        return count;
    }
}
