package com.syntax.class27.tasks;

public class GroupTask01 {
}

interface Shape{
    void calculateArea(double input);
    void calculatePerimeter(double input);
}

class Circle implements Shape{

    @Override
    public void calculateArea(double input) {
        double area = Math.PI*Math.pow(input,2);
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter(double input) {
        double perimeter = Math.PI*2*input;
        System.out.println(perimeter);
    }
}

class Square implements Shape{

    @Override
    public void calculateArea(double input) {
        double area = Math.pow(input,2);
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter(double input) {
        double perimeter = input*4;
        System.out.println(perimeter);
    }
}
