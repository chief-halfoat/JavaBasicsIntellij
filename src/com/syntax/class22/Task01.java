package com.syntax.class22;
//Create 1 class in which create a methods that will calculate the area (volume in case of box) of
//        Rectangle
//        Square
//        Box
public class Task01 {
    int length;
    double width;
    int height;

    public Task01(int length, double width) {
        this.length = length;
        this.width = width;
    }

    public Task01(double width, int length) {
        this.width = width;
        this.length = length;
    }

    public Task01(int length, double width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    void display(){
        System.out.println(length*width);
    }
    void display1(){
        System.out.println(height*length*width);
    }

    public static void main(String[] args) {
        new Task01(2,2.0).display();
        new Task01(2.0, 2).display();
        new Task01(2, 2, 2).display1();
    }
}
