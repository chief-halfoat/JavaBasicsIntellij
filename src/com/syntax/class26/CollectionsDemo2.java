package com.syntax.class26;

import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Morocco");
        countries.add("Iraq");
        countries.add("Ghana");
        countries.add("Eritrea");
        countries.add("Afghanistan");
        System.out.println(countries.get(3));
//        System.out.println(countries.get(-1));
//        Index out of bounds
//        System.out.println(countries.get(7));
        System.out.println(countries);
        countries.add(3, "Pakistan");
        System.out.println(countries);
        System.out.println(countries.size());


    }
}
