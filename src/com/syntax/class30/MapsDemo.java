package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("Apple",20.0);
        fruits.put("Banana", 10.2);
        fruits.put("Kiwi", 105.2);
        fruits.put("Orange", 16.5);
        fruits.put("Mango", 10.2);
        fruits.put("Banana", 12.5);
        System.out.println(fruits);
        System.out.println(fruits.get("Kiwi"));
        fruits.remove("Mango");
        System.out.println(fruits);
        System.out.println(fruits.containsKey("Banana"));
        System.out.println(fruits.containsValue(20.0));

        Set<String> keys = fruits.keySet();
        System.out.println(keys);
        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()){
            if(iterator.next().contains("e")){
                iterator.remove();
            }
        }
        System.out.println(keys);
        System.out.println(fruits);
    }
}
