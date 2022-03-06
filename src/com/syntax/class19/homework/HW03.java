package com.syntax.class19.homework;

//Write a Student class   that have instance variables name and address.
// Create a constructor that will initialize those variables.
// Print name & address of given  student using displayInfo method.

public class HW03 {

    String name;
    String address;

    public HW03(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void displayInfo (){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        new HW03("John", "123 Main Street").displayInfo();
    }
}
