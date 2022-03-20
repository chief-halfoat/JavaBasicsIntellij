package com.syntax.class09;

public class Homework03 {

	public static void main(String[] args) {
//		Create an array on integers and calculate the sum of all elements in an array

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);

		int sum2 = 0;

		for (int number : num) {
			sum2 = sum2 + number;
		}
		System.out.println(sum2);
	}

}
