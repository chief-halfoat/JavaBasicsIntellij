package com.syntax.class23;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    Dog (){
        System.out.println("No argument");
    }
    Dog (String name){
        this.name=name;
    }

    public Dog(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    void changeInfo(String name){
        this.name=name;
        System.out.println("First method");
    }
    void changeInfo(String name, String color){
        this.name=name;
        this.color=color;
        System.out.println("Second method");
    }
    void changeInfo(String name, String color, String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;
        System.out.println("Third method");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
