package com.syntax.class27;

//Create an ArrayList that will store 5 names into it.
//Find out whether the given ArrayList is empty or not?
//Check whether the specific name is present in an ArrayList or not?
//Find the size of your arrayList and print all values from that

import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("James");
        names.add("Joseph");
        names.add("Joshua");
        names.add("Jordan");

        System.out.println("Is the names array list empty? "+names.isEmpty());
        System.out.println("Joshua is present? "+names.contains("Joshua"));
        System.out.println("Size of names Array List? "+names.size());
        System.out.println(names);
    }
}
