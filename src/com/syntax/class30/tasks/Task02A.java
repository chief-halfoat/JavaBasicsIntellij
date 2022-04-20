package com.syntax.class30.tasks;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

//Create a map of countries with its capital that will store countries in alphabetical order.
//Print all keys and values from a country map using for each loop and iterator.
//Print all values from a country map using for each loop and iterator.
public class Task02A {
    public static void main(String[] args) {
        Map<String,String> countryAndCapital = new TreeMap<>();
        countryAndCapital.put("France","Paris");
        countryAndCapital.put("USA","Washington DC");
        countryAndCapital.put("Canada","Ottawa");
        countryAndCapital.put("England","London");
        countryAndCapital.put("Mexico","Mexico City");
        countryAndCapital.put("Egypt","Cairo");

        for(Map.Entry<String,String> entry:countryAndCapital.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        Iterator <Map.Entry<String,String>> entryIterator = countryAndCapital.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,String> entry = entryIterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
