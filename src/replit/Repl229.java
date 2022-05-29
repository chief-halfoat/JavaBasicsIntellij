package replit;

import java.util.HashMap;
import java.util.Map;

public class Repl229 {
    public static int countMaxChar(String str){

        char[] arr = str.toCharArray();
        Map<Character,Integer> counts = new HashMap<>();
        for(char ch:arr){
            counts.put(ch,counts.getOrDefault(ch,0)+1);
        }
        int maxCount = 0;
        for(Map.Entry<Character,Integer> entry:counts.entrySet()){
            if (entry.getValue()>maxCount){
                maxCount=entry.getValue();
            }
        }
        return maxCount;
    }
}
