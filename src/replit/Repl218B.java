package replit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repl218B {
    public static void main(String[] args) {
        List<String> trial = new ArrayList<>();
        trial.add("switch");
        trial.add("tv");
        trial.add("switch");
        trial.add("tv");
        System.out.println(countDeviceNames(trial));
    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        Map<String, Integer> counts = new HashMap<>();

        for(String str:deviceNames){
            if(counts.containsKey(str)){
                str=str+counts.get(str);
            }
            counts.put(str,counts.getOrDefault(str, 0)+1);
        }
        return deviceNames;
    }

}
