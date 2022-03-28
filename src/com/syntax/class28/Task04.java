package com.syntax.class28;
//Create an arrayList of even numbers from 1 to 500.
// Remove any number that is divisible by 5 from that arrayList.

import java.util.ArrayList;
import java.util.Iterator;

public class Task04 {
    public static void main(String[] args) {
        ArrayList<Integer> evens = new ArrayList<>();

        for (int i = 2; i <500; i+=2) {
            evens.add(i);
        }
        System.out.println(evens);

        evens.removeIf(integer -> integer % 5 == 0);
        System.out.println(evens);

    }
}
