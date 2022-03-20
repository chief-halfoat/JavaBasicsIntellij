package com.syntax.class04;

import java.util.Scanner;

public class Homework005 {

	public static void main(String[] args) {

		Scanner bonusEligibility = new Scanner(System.in);

		System.out.println("How many years have you worked here?");
		double yearsWorked = bonusEligibility.nextDouble();

		if (yearsWorked >= 5) {

			System.out.println("What is your annual salary?");
			double salaryAnnual = bonusEligibility.nextDouble();

			if (salaryAnnual > 50000) {
				System.out.println("You are eligible for a $5,000 bonus!");
			} else {
				System.out.println("You are eligible for a $3,000 bonus!");
			}
		} else {
			System.out.println("Unfortunately, you have not worked here long enough to qualify for a bonus.");
		}

	}

}
