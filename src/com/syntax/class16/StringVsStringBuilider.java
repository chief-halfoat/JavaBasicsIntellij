package com.syntax.class16;

public class StringVsStringBuilider {
    public static void main(String[] args) {
        String s = "Asghar is great";
        System.out.println(s.replace(" ", ""));
        System.out.println(s);

        StringBuilder stringbBuilder=new StringBuilder("Asghar is great");

        System.out.println(stringbBuilder.reverse());
        System.out.println(stringbBuilder);

    }
}
