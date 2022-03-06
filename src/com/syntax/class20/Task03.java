package com.syntax.class20;

public class Task03 {
}

class Teacher{
    String name;
    int age;
    void printName(){
        System.out.println(name);
    }
}

class MathTeacher extends Teacher{
        void teachMath(){
            System.out.println("Teaching math");
        }
}
class ChemistryTeacher extends Teacher{
    void teachSci(){
        System.out.println("Teaching science");
    }
}

class PianoTeacher extends Teacher{
    void teachPiano(){
        System.out.println("Teaching music");
    }
}

