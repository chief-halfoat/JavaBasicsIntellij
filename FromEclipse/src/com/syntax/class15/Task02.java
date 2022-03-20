package com.syntax.class15;

public class Task02 {

	// Create a String and if the String is not empty perform the following:
	// if the String has an odd number of characters and has 3 or more characters,
	// print the character in the middle of the String.

	void tester(String test) {
		if (test.length() % 2 != 0 && test.length() > 3) {
			System.out.println(test.charAt(test.length() / 2));
		}
	}

	// Create a String and print it in reverse order (Sunday → yadnuS).

	String palindrome(String word) {
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) {

		Task02 obj = new Task02();
		
		System.out.println(obj.palindrome("racer"));
		
		obj.tester("strings");
		
	}

}
