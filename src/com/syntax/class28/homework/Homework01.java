package com.syntax.class28.homework;

import java.sql.SQLOutput;

//Create a class Insurance that will have an attribute as
//        insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
// Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as
//        carModel and Class Pet has petType attribute.
// Create 3 objects of the sub classes and store them in ArrayList.
// Using for loop/advanced for loop/ iterator access all methods of the class.
public class Homework01 {
}

abstract class Insurance{
    String insuranceName;
    abstract void getQuote();
    abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;
    @Override
    void getQuote() {
        System.out.println("Get Car Insurance Quote");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancel Car Insurance");
    }
}
class Pet extends Insurance{
    String petType;

    @Override
    void getQuote() {
        System.out.println("Get Pet Insurance Quote");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancel Pet Insurance");
    }
}
class Health extends Insurance{
    @Override
    void getQuote() {
        System.out.println("Get Health Insurance Quote");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancel Health Insurace");
    }
}