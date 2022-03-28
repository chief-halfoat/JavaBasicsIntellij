package com.syntax.class28;
//Create an arrayList of drinks.
// If any drink has letter “a” or “e” replace it with water.

import java.util.ArrayList;

public class Task03 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coconut");
        drinks.add("Coca-Cola");
        drinks.add("Pepsi");
        drinks.add("Gatorade");
        drinks.add("tea");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i, "Water");
            }
        }
        System.out.println(drinks);
    }
}
