package com.syntax.reviews.review11;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> personInfo = new HashMap<>();
        personInfo.put(1111111,"Teyfur");
        personInfo.put(1556687,"Salim");
        personInfo.put(1588784,"Gulden");
        personInfo.put(1554789,"Pot");
        personInfo.put(4445555,"Eric");
        for(Map.Entry<Integer,String> entry:personInfo.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
