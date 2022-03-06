package com.syntax.class19;

public class Frog {

    String name;
    String color;
    int age;
    double weight;

    public Frog(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
