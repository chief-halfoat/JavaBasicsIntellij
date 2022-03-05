package com.syntax.class19;

public class TaskTester {
    public static void main(String[] args) {
        Task01 obj = new Task01();
        obj.Task01();
        Task01 obj1 = new Task01();
        obj1.Task01("Jack");

        obj.printName();
        obj1.printName();

        Task02 test1 = new Task02("John",85,96,97);
        Task02 test2 = new Task02("Emily",88,97,65);
        Task02 test3 = new Task02("Tony",55,87,77);
        Task02 test4 = new Task02("Jimmy",77,87,65);
        Task02 test5 = new Task02("Rob",85,65,74);


    }
}
