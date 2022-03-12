package com.syntax.class23;

public class StaticDemo {
    public static void main(String[] args) {

    }
}

class Cat{
    static int noOfLegs = 4;
    String name;

    public void printInfo(){
        System.out.println(name+noOfLegs);
    }
    public static void print(){

        //we cannot access instance fields directly inside static methods
       // System.out.println(name+noOfLegs);
    }
}
