package com.syntax.class16;

import java.util.Arrays;

//How would you reverse a String word by word? for example
// input=>This is sentence i want to reverse
// output=>sihT si ecnetnes i tnaw ot esrever
public class Task04 {
    public static void main(String[] args) {

        Task04 obj = new Task04();
        String s = "Sunday is great";
        System.out.println(obj.reverse(s));

        String[] strArray = s.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(obj.reverse(strArray[i]) + " ");
        }

    }

    String reverse(String inputString) {
        // Converting S string to StringBuilder so we can use the reverse method
        StringBuilder str = new StringBuilder(inputString);
        str.reverse();
        return str.toString();

    }

}


