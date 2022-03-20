package com.syntax.class04;

public class Task001 {

	public static void main(String[] args) {

		/*
		 * Write a program to store a boolean value of whether user has diploma or not.
		 * If user has a diploma, you should say congratulations, otherwise program
		 * should suggest to get a degree. Then if user has a degree program should
		 * check a gpa score. If gpa score is higher or equals to 3.5 → output should
		 * say “You are eligible for scholarship”, otherwise → “You should have studied
		 * harder” .
		 */

		boolean diploma = true;

		if (diploma) {
			System.out.println("Congratulations!");
			System.out.println("What is your gpa?");

			double gpa = 3.9;
			System.out.println(gpa);

			if (gpa >= 3.5) {
				System.out.println("You are eligible for a scholarship!");
			} else {
				System.out.println("You should have studied harder!");
			}
		} else {
			System.out.println("You should get a degree!");
		}

		System.out.println("***************************");

		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a
		 * house, otherwise user will consider buying. Once user decides to buy a house,
		 * if price of the house is larger than 50000 than user will take a loan,
		 * otherwise user will pay cash.
		 */

		double mortgageRate = 4;
		int mortgagePrice = 250000;

		System.out.println("The mortgage rate is " + mortgageRate);
		System.out.println("The mortgage price is " + mortgagePrice);
		if (mortgageRate <= 4.5) {
			System.out.println("User will buy the house");

			if (mortgagePrice > 50000) {
				System.out.println("User will take out a loan");
			} else {
				System.out.println("User will pay cash");
			}
		} else {
			System.out.println("User will not buy the house");
		}

	}

}
