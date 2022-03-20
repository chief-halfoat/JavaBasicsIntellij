package com.syntax.class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        String name = "Yazgul";
        String name2 = "Farah";

        String[] names = {"Yazgul", "Andrew",};
        String[] names2 = new String[1000];
        names2[0]="Elena";
        names2[2]="Andrew";
        System.out.println(Arrays.toString(names2));
        ArrayList<String> syntaxStudents=new ArrayList<>();
        syntaxStudents.add("Dmitriy");
        syntaxStudents.add("Mike");
        syntaxStudents.add("Andrew");
        System.out.println(syntaxStudents);
    }
}
