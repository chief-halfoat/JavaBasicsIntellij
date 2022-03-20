package com.syntax.class08;

public class Task002 {

	public static void main(String[] args) {

		// Print numbers from 1 to 50 except those that are divisible by 3

		// int i = 0;

		for (int j = 0; j <= 50; j++) {
			if (j % 3 == 0) {
				continue;
			}

			System.out.println(j);
		}

	}

}
