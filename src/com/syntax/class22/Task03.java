package com.syntax.class22;

public class Task03 {
    public static void method(String name) {
        System.out.println("1");
    }

    public static void method(boolean bol) {
        System.out.println("2");
    }

    public static void method(int num) {
        System.out.println("3");
    }

    public static void main(String[] args) {
        method(false);
        method(2);
        method("a");
    }
}
