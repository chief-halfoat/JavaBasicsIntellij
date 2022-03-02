package com.syntax.class16;
//How would you check if String is palindrome or not? aba=> true
//Abbc =>false

public class Task05 {
    public static void main(String[] args) {
        String orig = "racecar";
        orig = orig.replace(" ", "");
        orig = orig.replace(",", "");
        orig = orig.toLowerCase();

        String reverse = "";
        for (int i = orig.length() - 1; i >= 0; i--) {
            reverse += orig.charAt(i);

        }

        boolean palindrome = true;

        for (int i = 0; i < orig.length(); i++) {
            if (orig.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }

        if (palindrome == true) {
            System.out.println("You've got yourself a palindrome!");
        } else {
            System.out.println("whomp whomp");
        }

    }
}
