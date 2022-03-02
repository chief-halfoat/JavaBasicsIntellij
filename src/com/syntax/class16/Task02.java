package com.syntax.class16;
//Create a String that should be combination of letters, numbers and special characters.
//Find out how many Alphanumeric characters are there in the String.
public class Task02 {
    public static void main(String[] args) {
        String str = "jnoiuhsdOIUHIDHF13221321#$@#$#@";
        ;
        System.out.println(str.replaceAll("[0-9A-Za-z]", "").length());
    }
}
