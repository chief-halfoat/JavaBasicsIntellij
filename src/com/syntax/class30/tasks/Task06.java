package com.syntax.class30.tasks;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Create the collection that will store single uniques Objects of a String type in which order is preserved.
//Write a logic to concatenate all string from the collection.
//Create a collection of integers in which you can keep duplicates.
//Write a logic to find sum of all integers
public class Task06 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("super");
        linkedList.add("calla");
        linkedList.add("fragil");
        linkedList.add("istic");
        linkedList.add("expi");
        linkedList.add("alla");
        linkedList.add("docius");

        String concat = "";
        for (String s:linkedList
             ) {
            concat+=s;
        }
        System.out.println(concat);

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);

        int sum = 0;
        for (Integer i:ints
             ) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
