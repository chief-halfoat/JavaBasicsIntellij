package lee.alex.basics;

import java.util.Scanner;

public class ForLoopPatterns {

	public static void main(String[] args) {

		System.out.println("Hello! How many stars would you like?");

		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		for (int i = 1; i <= k; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = k - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
