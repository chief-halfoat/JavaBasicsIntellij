package com.syntax.class16;
//You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
// How would you find out how many sentences are in that String?
public class Task03A {
    public static void main(String[] args) {

        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] strArray = a.split("[!-/:-@]");
        System.out.println(strArray.length);

    }
}
