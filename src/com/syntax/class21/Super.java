package com.syntax.class21;

public class Super {
    public static void main(String[] args) {
        Child child = new Child();
        child.printColor();
    }
}

class Parent{
    String color = "Black";
}

class Child extends Parent{
    String color ="red";

    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }

}
