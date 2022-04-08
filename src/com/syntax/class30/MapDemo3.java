package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("Apple", 20.0);
        fruits.put("Banana", 10.2);
        fruits.put("Kiwi", 105.2);
        fruits.put("Orange", 16.5);
        fruits.put("Mango", 10.2);
        fruits.put("Banana", 12.5);
        Collection<Double> values=fruits.values();
        System.out.println(values);
        Iterator<Double> iterator = values.iterator();
        while (iterator.hasNext()){

            if(iterator.next()>=20){
                iterator.remove();
            }
        }
        System.out.println(values);
    }
}