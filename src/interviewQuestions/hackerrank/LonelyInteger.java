package interviewQuestions.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(2);
        System.out.println(lonelyinteger(a));

    }
    public static int lonelyinteger(List<Integer> a) {
        int ans = 0;
        Map<Integer,Integer> map = new HashMap();
        for(Integer num:a){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
