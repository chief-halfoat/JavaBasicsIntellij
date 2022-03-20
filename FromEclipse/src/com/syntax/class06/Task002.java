package com.syntax.class06;

import java.util.Scanner;

public class Task002 {

	public static void main(String[] args) {

		Scanner ask = new Scanner(System.in);

		System.out.println("What grade did you receive?");

		String grade = ask.nextLine();

		String rating = "";

		switch (grade.toLowerCase()) {

		case "a":
			rating = "Excellent";
			break;
		case "b":
			rating = "Good";
			break;
		case "c":
			rating = "Average";
			break;
		case "d":
			rating = "Bad";
			break;
		default:
			rating = "Not Acceptable";
		}

		System.out.println("Your grade is "+grade+" and that is "+rating);
	}

}
