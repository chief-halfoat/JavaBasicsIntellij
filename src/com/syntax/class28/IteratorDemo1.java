package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo1 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();

        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");

//        for (int i = 0; i <5 ; i++) {
//            if(courses.get(i).equals("Java"));{
//                courses.remove("Java");
//            }
//        }

        Iterator<String> iterator = courses.iterator();


    }
}