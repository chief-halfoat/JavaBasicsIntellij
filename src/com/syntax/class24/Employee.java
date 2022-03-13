package com.syntax.class24;

public interface Employee {
    void work();
    int age=10;
}
class Tester implements Employee{

    @Override
    public void work() {
        System.out.println("Testing a website");
    }

    public static void main(String[] args) {
        new Tester().work();
        System.out.println(new Tester().age);
    }
}
