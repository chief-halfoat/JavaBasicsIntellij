package com.syntax.class16;

import java.util.Arrays;

public class StringDemo3 {
    public static void main(String[] args) {
        String s = "This is a sentence";
        String[] strArr = s.split(" ");
        System.out.println(Arrays.toString(strArr));
    }
}
