package com.syntax.class23;
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
public class HWK01 {
}

class  Student{
    void study(){
        System.out.println("Students must study to pass");
    }
    void doHomework(){
        System.out.println("Students must Do homework");
    }
    void practice(){
        System.out.println("Students must do practice");
    }
}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax students must study 25 hours a week");
    }
    void doHomework(){
        System.out.println("Syntax students must solve Repls");
    }
    @Override
    void practice(){
        System.out.println("Syntax students must do their own research");
    }
}
class CollegeStudent extends Student{
    @Override
    void doHomework(){
        System.out.println("College students can skip some of the homeworks");
    }
}
class SchoolStudent extends Student{}