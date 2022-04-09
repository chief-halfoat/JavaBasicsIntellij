package com.syntax.class30.tasks;

import java.util.HashMap;
import java.util.Map;

//Create a Map that will store Employee name and salary.
// Write a logic to retrieve an employee who gets the highest salary.
// Output should be in the below format:
//John Smith=$100000
public class Task05 {
    public static void main(String[] args) {
        HashMap<String, Integer> employees = new HashMap<>();
        employees.put("Joe",50000);
        employees.put("Steve",75000);
        employees.put("Claire",100000);
        employees.put("Evan",25000);

        Map.Entry<String,Integer> maxValue =null;
        for (Map.Entry<String,Integer> e:employees.entrySet()
             ) {
            if (maxValue==null||e.getValue().compareTo(maxValue.getValue())>0){
                maxValue=e;
            }
        }
        System.out.println(maxValue);
    }
}
