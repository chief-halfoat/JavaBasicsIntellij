package com.syntax.class04;

import java.util.Scanner;

public class Homework005A {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Pick a number:");
		int a = scan.nextInt();
		System.out.println("Pick a second number:");
		int b = scan.nextInt();
		System.out.println("Pick a third number:");
		int c = scan.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is the largest number.");
			} else {
				System.out.println(c + " is the largest number.");
			}
		} else if (b > c) {
			System.out.println(b + " is the largest number.");
		} else {
			System.out.println(c + " is the largest number.");
		}
	}

}
