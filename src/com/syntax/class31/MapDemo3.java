package com.syntax.class31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,Double> fruits = new HashMap<>();
        fruits.put("Apple",10.0);
        fruits.put("Orange",15.0);

        HashMap<String,Double> vegetables = new HashMap<>();
        vegetables.put("Onion", 12.5);
        vegetables.put("Carrot",10.6);
        ArrayList<HashMap<String,Double>> list = new ArrayList<>();
        list.add(fruits);
        list.add(vegetables);

        System.out.println(list);
    }
}
