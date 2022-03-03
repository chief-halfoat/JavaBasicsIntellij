package com.syntax.class18;

public class Task01 {
    protected void sumOfArr(int[] input){
        int sum1=0;
        for (int i = 0; i < input.length; i++) {
            sum1+=input[i];
        }
        System.out.println(sum1);
    }

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};


        Task01 obj = new Task01();
        obj.sumOfArr(myArray);
    }}

