package com.syntax.class04;

import java.util.Scanner;

public class Homework006 {

	public static void main(String[] args) {

		Scanner numbers = new Scanner(System.in);
		System.out.println("Pick a number:");
		int a = numbers.nextInt();
		System.out.println("Pick a second number:");
		int b = numbers.nextInt();
		System.out.println("Pick a third number:");
		int c = numbers.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is the largest number.");
			}
		} else if (b > a) {
			if (b > c) {
				System.out.println(b + " is the largest number.");
			}
		} else if (c > a) {
			if (c > b) {
				System.out.println(c + " is the largest number.");
			}
		} else {
			System.out.println("Error");
		}
	}
}
