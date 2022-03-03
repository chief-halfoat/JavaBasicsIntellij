package com.syntax.class18;

public class Task03 {

    private static String removeVowels(String input){
        input = input.replaceAll("[^aeiouAEIOU]", "");
        return input;
    }

    public static void main(String[] args) {
        Task03 obj = new Task03();
        System.out.println(obj.removeVowels("eutopia"));
    }
}
