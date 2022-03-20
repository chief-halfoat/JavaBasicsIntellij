package com.syntax.class08;

import java.util.Scanner;

public class Task003 {

	public static void main(String[] args) {
//	Create a program that will keep asking
//	a user to apply for a credit card.
//	As soon as you get a "yes" from a user,
//	the program should stop asking

		Scanner sc = new Scanner(System.in);
		String ans;
		
		do {
			System.out.println("Do you want to apply for a credit card");
			ans = sc.nextLine();
		} while (!ans.equalsIgnoreCase("yes"));
		
		System.out.println("Thanks!");
		
		
	}

}
