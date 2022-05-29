package interviewQuestions.hackerrank;

import java.util.*;

public class SparseArrays {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("aba");
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");
        List<String> queries = new ArrayList<>();
        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");
        System.out.println(matchingStrings(strings,queries));
    }
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> counts = new ArrayList<>();
        LinkedHashMap<String, Integer> countMap = new LinkedHashMap<>();
        for(String query:queries){
            countMap.put(query, 0);
        }
        for(String str:strings){
            for(Map.Entry<String, Integer> entry:countMap.entrySet()){
                if(entry.getKey().equals(str)){
                    countMap.put(entry.getKey(), entry.getValue()+1);
                }
            }
        }

        for(Map.Entry<String, Integer> entry:countMap.entrySet()){
            counts.add(entry.getValue());
        }

        return counts;
    }


    public static List<Integer> matchingStringsA(List<String> strings, List<String> queries) {
        Map<String, Integer> stringsMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i<strings.size(); i++){
            String elem = strings.get(i);
            if(stringsMap.containsKey(elem)){
                int count = stringsMap.get(elem);
                stringsMap.put(elem, count+1);
            } else {
                stringsMap.put(elem, 1);
            }
        }

        for(int j=0; j<queries.size(); j++){
            String que = queries.get(j);
            if(stringsMap.containsKey(que)){
                result.add(stringsMap.get(que));
            } else {
                result.add(0);
            }
        }
        return result;
    }

}



