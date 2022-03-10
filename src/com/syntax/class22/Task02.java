package com.syntax.class22;
//Create a class named 'Programming'.
// While creating an object of the class, if nothing is passed to it,
// then the message "I love programming languages" should be printed.
// If some String is passed to it, then in place of "programming languages"
// the value variable should be printed.
//
// Example, if we pass "Java", then "I love Java" should be printed.
public class Task02 {
}

class Programming{

    String input="programming languages";
    Programming(){}
    Programming(String input){
        this.input=input;
    }
    void output(){
        System.out.println("I love "+input);
    }
}

class Test{
    public static void main(String[] args) {

    new Programming().output();
    new Programming("Java").output();
}}
