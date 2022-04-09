package com.syntax.class31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//data structure nesting
public class MapsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("carrot");
        vegetables.add("onion");

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Banana");

        Map<String,ArrayList<String>> healthFoods = new HashMap<>();
        healthFoods.put("Vegetables",vegetables);
        healthFoods.put("Fruit",fruit);
        System.out.println(healthFoods);
    }
}
