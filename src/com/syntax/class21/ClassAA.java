package com.syntax.class21;

public class ClassAA {
    String name;
    int age;
    double weight;

    public ClassAA(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
}
class ClassBB extends ClassAA{
    public ClassBB(String name, int age, double weight) {
        super(name, age, weight);
    }
}
class Test{
    public static void main(String[] args) {
        new ClassBB("John",33,91).printInfo();
    }

}
