package com.syntax.class28;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        LinkedHashSet<String> fruit = new LinkedHashSet<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Cur");
        fruit.add("Pineapple");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit);


        TreeSet<String> fruitTree=new TreeSet<>();
        fruitTree.add("Apple");
        fruitTree.add("Mango");
        fruitTree.add("Kiwi");
        fruitTree.add("Cur");
        fruitTree.add("Pineapple");
        fruitTree.add("Orange");
        fruitTree.add("Banana");
        fruitTree.add("Apple");
        System.out.println(fruitTree);
    }
}
