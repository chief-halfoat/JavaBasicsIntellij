package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("Apple",20.0);
        fruits.put("Banana", 10.2);
        fruits.put("Kiwi", 105.2);
        fruits.put("Orange", 16.5);
        fruits.put("Mango", 10.2);
        fruits.put("Banana", 12.5);

        System.out.println(fruits.entrySet());
        for (Map.Entry<String, Double> entry: fruits.entrySet()
             ) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("====================================");
        }
    }
}
