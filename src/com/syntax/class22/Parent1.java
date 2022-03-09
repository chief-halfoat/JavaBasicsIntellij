package com.syntax.class22;

public class Parent1 {
    String name="Parent";
    void printName(){
        System.out.println(name);
    }
}

class Child extends Parent1{
    String name = "Child";
    void printName(){
        System.out.println(name);
    }
}

class ParentTester{
    public static void main(String[] args) {
        Child child = new Child();
        child.printName();
    }

}