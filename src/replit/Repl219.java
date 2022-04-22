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

        System.out.println(countOnlyPrefixes(names,query));
}


    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query){
        List<Integer> counts = new ArrayList<>();
        //creating a map to store the query list and a tally
        Map<String, Integer> count = new LinkedHashMap<>();
        //putting the query list into the map and giving all names an initial count of 0
        for(String quer:query){
            count.put(quer,0);
        }
        //looping through the keySet, which is now made of the queryNames
        for(String queryName:count.keySet()){
            //looping through the nameList
            for(int i=0;i< names.size();i++){
                //comparing the name to the query name
                //per the prompt, the name does not count if the prefix is the name straight up,
                //so first check is if the name is longer than the queryName
                //then we check if the name contains the queryName
                if(names.get(i).length()>queryName.length()&&names.get(i).contains(queryName)){
                    //if both conditions are met, we are incrementing the count, now the keyValue, by 1
                    count.put(queryName,count.get(queryName)+1);
                }
            }
        }
        //looping through the map using the entrySet
        for(Map.Entry<String,Integer> entry:count.entrySet()){
            //taking the values and adding them to a List
            counts.add(entry.getValue());
        }
        //returning the List
        return counts;
    }
}
