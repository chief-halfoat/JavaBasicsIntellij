package com.syntax.class22;

public class IfElseDemo {
    public static void main(String[] args) {

        int number=10;
//        number>10?System.out.println("The number is greater"):System.out.println("The number is smaller");
    }
    int maxNumber(int num1, int num2){
//        if(num1>num2){
//            return num1;
//        } else {
//            return num2;
//        }


       return num1>num2?num1:num2;
    }
}
