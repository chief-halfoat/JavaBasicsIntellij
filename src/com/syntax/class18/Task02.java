package com.syntax.class18;

public class Task02 {

    public String reverse(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        str.reverse();
        return str.toString();
    }
    public boolean isPalindrome(String inputString) {
        String reversedStr = reverse(inputString);
        return reversedStr.equals(inputString);
    }

    public static void main(String[] args) {
        Task02 obj = new Task02();
        System.out.println(obj.isPalindrome("racecar"));
    }
}
