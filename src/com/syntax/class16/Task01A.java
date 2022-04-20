package com.syntax.class16;
//Create a String that will hold a sentence. Write a program to get a new String without any spaces.

public class Task01A {
    public static void main(String[] args) {
        String str = "There is no war in Ba Sing Se";
        String strNoSpaces = str.replace(" ","");
        System.out.println(strNoSpaces);
    }
}
