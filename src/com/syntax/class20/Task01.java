package com.syntax.class20;

import org.w3c.dom.ls.LSOutput;

public class Task01 {
}

class A {

    public static String name = "John";
}

class B extends A {
}

class C extends B {
    public static void main(String[] args) {
        System.out.println(A.name);
    }
}
