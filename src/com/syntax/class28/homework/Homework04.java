package com.syntax.class28.homework;

import java.util.TreeSet;

//Create a Set collection in which you need to add names of the countries.
// In this set we want all objects to be sorted in alphabetical order.
// Using 2 different ways retrieve all elements from set.
public class Homework04 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("Japan");
        countries.add("Corea");
        countries.add("Mexico");
        countries.add("Australia");
        countries.add("Zimbabwe");
        System.out.println("=====Print Statement=====");
        System.out.println(countries);
        System.out.println("======Enhanced For Loop======");
        for(String country:countries){
            System.out.println(country);
        }
    }
}
