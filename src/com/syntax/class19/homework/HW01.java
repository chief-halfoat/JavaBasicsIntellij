package com.syntax.class19.homework;
//Write a java class that have 4 constructors with 4 different access levels of constructors
// (private,public,default,protected) and create 4 objects of this class:
// 1 - inside same class; 2 - from outside the class;
// 3 - from different class inside different package  and observe result.
public class HW01 {

    String name;
    int age;

    public HW01(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("public");
    }
    private HW01(String name) {
        this.name = name;
        System.out.println("private");
    }
    protected HW01(int age){
        this.age=age;
        System.out.println("protected");
    }
    HW01(){
        System.out.println("default");
    }

    public static void main(String[] args) {

//
//        HW01 t1 = new HW01();
//        HW01 t2 = new HW01("",1);
//        HW01 t3 = new HW01("");
//        HW01 t4 = new HW01(1);

        new HW01("John", 2);
        new HW01("John");
        new HW01(2);
        new HW01();
    }



}
