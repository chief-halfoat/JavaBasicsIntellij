package com.syntax.class30.tasks;

//Create a map of countries with its capital that will store countries in alphabetical order.
//Print all keys and values from a country map using for each loop and iterator.
//Print all values from a country map using for each loop and iterator.

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task02 {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("France","Paris");
        map.put("Portugal","Lisbon");
        map.put("Canada","Ottawa");
        map.put("Brazil","Brasilia");
        map.put("Ukraine","Kiev");

        System.out.println("============FOR LOOP============");
        for (Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("============ITERATOR============");
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("============VALUES WITH FOR LOOP============");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getValue());
        }
        System.out.println("============VALUES WITH ITERATOR============");
        iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
            System.out.println(entry.getValue());
        }
    }
}
