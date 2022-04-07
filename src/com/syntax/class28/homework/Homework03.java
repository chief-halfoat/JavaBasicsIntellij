package com.syntax.class28.homework;

import java.util.*;

//How can you remove all duplicates from ArrayList?

public class Homework03 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        HashSet<String> names = new HashSet<>(aList);
        System.out.println(names);

        LinkedHashSet<String> namesLinked = new LinkedHashSet<>(aList);
        System.out.println(namesLinked);

        TreeSet<String> namesTree = new TreeSet<>(aList);
        System.out.println(namesTree);

        aList.clear();
        aList.addAll(namesTree);
        System.out.println(aList);
    }
}
