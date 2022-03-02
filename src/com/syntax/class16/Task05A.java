package com.syntax.class16;
public class Task05A {
    public static void main(String[] args) {
        Task05A task = new Task05A();
        System.out.println(task.isPalindrome("aba"));
        System.out.println(task.isPalindrome("abc"));
    }
    String reverse(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        str.reverse();
        return str.toString();
    }
    boolean isPalindrome(String inputString) {
        String reversedStr = reverse(inputString);
        return reversedStr.equals(inputString);
    }
}