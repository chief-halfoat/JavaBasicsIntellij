package com.syntax.class10;

public class Task001 {

	public static void main(String[] args) {

		int[] reverse = { 12, 23, 34, 45, 56, 67, 78, 89, 90 };

		for (int i = (reverse.length - 1); i >= 0; i--) {
			System.out.print(reverse[i] + " ");
		}

	}

}
