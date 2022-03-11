package com.syntax.review05;

public class Main {

    public static String generateUserName(String firstName, String lastName, int age){
        String userName=firstName+lastName+age;
        return userName;
    }

    public static void main(String[] args) {

        System.out.println(generateUserName("John", "Hart", 33));
    }
}