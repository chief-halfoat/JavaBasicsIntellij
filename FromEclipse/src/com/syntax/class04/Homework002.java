package com.syntax.class04;

import java.util.Scanner;

public class Homework002 {

	public static void main(String[] args) {

		Scanner question = new Scanner(System.in);
		System.out.println("How old are you?");

		int age = question.nextInt();

		if (age >= 18) {
			System.out.println("We will issue a driver's license.");
		} else {
			System.out.println("You can apply for a learner's permit");
		}

	}

}
