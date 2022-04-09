package com.syntax.class30.tasks;

import java.util.Map;
import java.util.TreeMap;

public class Task04Tester {
    public static void main(String[] args) {
        TreeMap<String,Person> personTreeMap = new TreeMap<>();
        personTreeMap.put("a",new Person("John","Hart",33,150000));
        personTreeMap.put("b",new Person("Steve","Young",45, 20000000));
        personTreeMap.put("c", new Person("Sidney","Crosby",34, 8700000));

        for (Map.Entry<String,Person> p:personTreeMap.entrySet()
             ) {
            System.out.println(p);
        }
    }
}
