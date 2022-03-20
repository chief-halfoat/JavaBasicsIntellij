package com.syntax.class09;

public class Homework04 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.

		int[] numbers = { 1, 2, 3, 4, 5, 6, 4000, 7, 8, 9, 10, 2000 };

		int largest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		System.out.println(largest);
	}

}
