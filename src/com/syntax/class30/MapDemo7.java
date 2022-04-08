package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo7 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("Apple", 20.0);
        fruits.put("Banana", 10.2);
        fruits.put("Kiwi", 105.2);
        fruits.put("Orange", 16.5);
        fruits.put("Mango", 10.2);
        fruits.put("Banana", 12.5);

        Iterator<Map.Entry<String, Double>> iterator = fruits.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Double> entry = iterator.next();
            if(entry.getKey().endsWith("e")||entry.getValue()>=20){
            iterator.remove();
        }}
        System.out.println(fruits);
    }
}