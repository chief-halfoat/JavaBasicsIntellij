package com.syntax.class30;
import java.util.*;

class Main {

    static void display(Map<String, Integer> map){
        for (Map.Entry<String,Integer> me : map.entrySet()){
            if(!map.isEmpty()){
                System.out.println(me.getKey()+" : "+me.getValue());
            } else if (map.size()==0){
                System.out.println("map is empty");
            }
        }
    }

    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        display(map);
        map.clear();
        display(map);

    }
}
