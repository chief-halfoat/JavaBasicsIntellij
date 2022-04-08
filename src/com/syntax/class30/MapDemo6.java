package com.syntax.class30;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("Apple", 20.0);
        fruits.put("Banana", 10.2);
        fruits.put("Kiwi", 105.2);
        fruits.put("Orange", 16.5);
        fruits.put("Mango", 10.2);
        fruits.put("Banana", 12.5);

        System.out.println(fruits.keySet());
        System.out.println(fruits.values());
        System.out.println(fruits.entrySet());

        Iterator<Map.Entry<String, Double>> iterator = fruits.entrySet().iterator();

    }
}