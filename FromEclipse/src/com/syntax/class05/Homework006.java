package com.syntax.class05;

import java.util.Scanner;

public class Homework006 {

	public static void main(String[] args) {

		Scanner question = new Scanner(System.in);
		System.out.println("What month were you born?");
		String month = question.next();

		if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")
				|| month.equalsIgnoreCase("December")) {
			System.out.println("You were born in the Winter!");
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			System.out.println("You were born in the Spring!");
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			System.out.println("You were born in the Summer!");
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			System.out.println("You were born in the Fall!");
		} else {
			System.out.println("Invalid Month.");
		}

	}

}
