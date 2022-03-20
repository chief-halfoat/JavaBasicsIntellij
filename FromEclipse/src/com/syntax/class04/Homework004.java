package com.syntax.class04;

import java.util.Scanner;

public class Homework004 {

	public static void main(String[] args) {

		Scanner justAsking = new Scanner(System.in);

		System.out.println("Do you have a credit card?");

		String creditCard = justAsking.next();

		if (creditCard.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on the card?");

			int balance = justAsking.nextInt();

			if (balance > 1000) {
				System.out.println("You should pay off your card immediately!");
			} else {
				System.out.println("You can spend more money");
			}

		} else {
			System.out.println("Would you like to get a credit card?");
		}

	}

}
