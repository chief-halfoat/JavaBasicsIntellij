package com.syntax.class16;
//How would you reverse a String word by word? for example
// input=>This is sentence i want to reverse
// output=>sihT si ecnetnes i tnaw ot esrever
public class Task04 {
    public static void main(String[] args) {

        String s = "Sunday is great";

        String [] strArray = s.split(" ");

        for (int i =0; i< strArray.length; i++){
            System.out.println(strArray[i]);
            }

        }
    }

