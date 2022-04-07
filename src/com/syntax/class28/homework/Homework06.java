package com.syntax.class28.homework;

import java.util.HashSet;
import java.util.Iterator;

//Create a Set collection that will hold Objects of Student Type.
// In this set we do not care about the insertion order.
// Each student object should have name and studentID. Display name of each student.
public class Homework06 {
    public static void main(String[] args) {
        Student student1 = new Student("John", "123");
        Student student2 = new Student("Steve", "456");
        Student student3 = new Student("Joe","789");

        HashSet<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for(Student student:students){
            System.out.println(student.name+" "+student.studentID);
        }
//
//        Iterator<Student> studentIterator = students.iterator();
//        while (studentIterator.hasNext()){
//            Student it = studentIterator.next();
//            System.out.println(it.name);
//            System.out.println(it.studentID);
//        }
    }
}
class Student {
    String name;
    String studentID;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }
}
