package com.syntax.class27.tasks;

public class GroupTask02Tester {
    public static void main(String[] args) {
        A a = new A(95,90,85);
        System.out.println(a.getPercentage()+"%");
        B b = new B(95,90, 85, 80);
        System.out.println(b.getPercentage()+"%");
    }
}
