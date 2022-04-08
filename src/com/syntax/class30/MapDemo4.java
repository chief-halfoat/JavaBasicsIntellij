package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("Apple",20.0);
        fruits.put("Banana", 10.2);
        fruits.put("Kiwi", 105.2);
        fruits.put("Orange", 16.5);
        fruits.put("Mango", 10.2);

        Iterator<String> iterator = fruits.keySet().iterator();

        while(iterator.hasNext()){
            String key = iterator.next();
            Double value = fruits.get(key);
            if(key.contains("e")&&value>=20){
                iterator.remove();
            }
        }
        System.out.println(fruits);
    }
}
