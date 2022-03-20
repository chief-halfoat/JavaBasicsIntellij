package com.syntax.class04;

public class Task002 {

	public static void main(String[] args) {

		/*
		 * Create a Java program and call it a Donor. In order to be eligible to donate
		 * your blood you have to be 18 years old. Also once you identify age
		 * eligibility then we have to see if person matches weight requirements. If
		 * person weight it more than 110 lbs → then he/she is eligible, otherwise we
		 * cannot accept such a patient.
		 */

		boolean donateBlood = true;

		if (donateBlood) {
			System.out.println("I want to donate blood");

			int age = 24;
			int weight = 150;

			if (age >= 18) {
				System.out.println("You are old enough to donate blood.");

				if (weight >= 110) {
					System.out.println("You weigh enough to donate blood.");
				} else {
					System.out.println("You do not weigh enough to donate blood");
				}
			} else {
				System.out.println("You are not old enough to donate blood");
			}

		}

	}
}
