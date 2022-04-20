package replit;

import java.util.*;

public class Repl217 {

    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(12);
        numbers1.add(12);
        numbers1.add(7);
        numbers1.add(7);
        numbers1.add(7);
        numbers1.add(7);
        numbers1.add(7);
        System.out.println(countDuplicates(numbers1));
    }

    static int countDuplicates(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer n:numbers){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            } else {
                map.put(n,1);
            }
        }
        int count = 0;
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry:entrySet){
            if(entry.getValue()>1){
                count++;
            }
        }
        return count;
    }
}
