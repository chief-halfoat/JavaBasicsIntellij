package com.syntax.class28;

import java.util.HashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        HashSet<String> fruit = new HashSet<>();
        //No duplicates and no insertion order is guaranteed
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
