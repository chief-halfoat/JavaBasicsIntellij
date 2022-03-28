package com.syntax.class28;
//Create an arrayList of words. Remove every word that ends with “e”.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Task02 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Love");
        words.add("Lahore");
        words.add("Cake");
        words.add("Engines");

        System.out.println(words);
        words.removeIf(s -> s.toLowerCase().endsWith("e"));
        System.out.println(words);
    }
}
