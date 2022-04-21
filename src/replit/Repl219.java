package replit;

import java.util.*;

//Count how many times a given word from a list is present as prefix in another list both lists will be given as input to the function
//You have to implment a method that takes two lists as input one list contains the query words that we want to search from the other list.
//Word List ["steve","stevens","danny","steves","dan","john","johny" ,"joe" ,"alex" ,"alexander"]
//Query Word List ["steve","alex","joe","john","dan"]
//output
//[2, 1, 0, 1, 1]
//As word steve is present as prefix in word stevens and steves so we get 2 for it note we are not counting if we have the exact word in the original list
//word alex is prefix in alexander so we get 1
//word joe is not present as prefix so we get 0
public class Repl219 {
    public static void main(String[] args) {
    System.out.println("Hello world!");
    List<String> names = new ArrayList<>();
    names.add("steve");
    names.add("stevens");
    names.add("danny");
    names.add("steves");
    names.add("dan");
    names.add("john");
    names.add("johnny");
    names.add("joe");
    names.add("alex");
    names.add("alexander");

    List<String> query = new ArrayList<>();
    query.add("steve");
    query.add("alex");
    query.add("joe");
    query.add("john");
    query.add("dan");

//        System.out.println(countOnlyPrefixes(names,query));
}


//    public static Map<String,Integer> countOnlyPrefixes(List<String> names, List<String> query){
//        List<Integer> counts = new ArrayList<>();
//        Map<String, Integer> count = new LinkedHashMap<>();
//        for(int i=0; i<query.size();i++){
//            for(int j=0; j<names.size();j++){
//                if(names.get(j).length()>query.get(i).length()&&names.get(j).contains(query.get(i))){
//                    count.put(query.get(i),count.get(query.get(i))+1);
//                }
//            }
//        }
//        return count;
//    }
}
