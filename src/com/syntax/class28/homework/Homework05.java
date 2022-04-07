package com.syntax.class28.homework;

import java.util.Iterator;
import java.util.LinkedHashSet;

// Create a Set of cities in which you want to make sure that insertion order is maintained.
// Then remove any city that starts with "A";
public class Homework05 {
    public static void main(String[] args) {

        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Los Angeles");
        cities.add("San Francisco");
        cities.add("New York");
        cities.add("Miami");
        cities.add("Atlanta");
        cities.add("Walnut Creek");
        cities.add("Arlington");
        cities.add("Oakland");
        cities.add("Boston");
        System.out.println(cities);
        cities.removeIf(it -> it.startsWith("A"));
        System.out.println(cities);
    }
}
