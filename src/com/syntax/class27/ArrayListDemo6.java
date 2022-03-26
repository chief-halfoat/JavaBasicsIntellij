package com.syntax.class27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo6 {
    public static void main(String[] args) {
//        String[] names = new String[]{"John","Joe","Josh","James"};
        List<String> list = Arrays.asList("John","Joe","Josh", "James");
        System.out.println(list);
    }
}
