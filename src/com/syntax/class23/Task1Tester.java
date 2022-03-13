package com.syntax.class23;

public class Task1Tester {
    public static void main(String[] args) {
        Student[] students = {new SyntaxStudent(), new SchoolStudent(), new CollegeStudent()};

        for (Student student:students){
            student.study();

            student.doHomework();

            student.practice();
            System.out.println("----------------");
        }

    }
}
