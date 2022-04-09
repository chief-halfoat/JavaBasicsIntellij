package com.syntax.class30.tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Create a map of Best Buy store. Place
//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Retrieve all keys and values from a Best Buy map using EntrySet.
public class Task03 {
    public static void main(String[] args) {
        HashMap<Integer, String> bestBuy = new HashMap<>();
        bestBuy.put(654879,"Printer");
        bestBuy.put(155478,"TV");
        bestBuy.put(987458,"Laptop");

        Iterator<Map.Entry<Integer,String>> iterator = bestBuy.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
