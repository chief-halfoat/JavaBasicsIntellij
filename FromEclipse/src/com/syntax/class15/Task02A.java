package com.syntax.class15;

import java.util.ArrayList;

// Create a String and if the String is not empty perform the following:
// if the String has an odd number of characters and has 3 or more characters,
// print the character in the middle of the String.
public class Task02A {
    public static void main(String[] args) {

        String count = "";
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i =1; i<10; i++){
            count =count+i;
            stringArrayList.add(count);
        }

        System.out.println(stringArrayList);
        for(String string:stringArrayList){

            charGetter(string);
        }
    }

    static void charGetter (String input){
        if(input.length()>=3&&input.length()%2!=0){
            System.out.println(input.charAt(input.length()/2));
        } else {
            if(input.length()<3){
                System.out.println("The input String is not long enough");
            } else if (input.length()%2==0){
                System.out.println("The input String has an even number of characters");
            }
        }
    }

    static void charGetter2 (String input){
        StringBuilder sb1 = new StringBuilder(input);
        if(sb1.length()%2!=0&& sb1.length()>=3){
            System.out.println(sb1.charAt(sb1.length()/2));
        }
    }
}
