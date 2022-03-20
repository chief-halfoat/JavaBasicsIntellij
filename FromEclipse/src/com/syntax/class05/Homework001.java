package com.syntax.class05;

import java.util.Scanner;

public class Homework001 {

	public static void main(String[] args) {

		Scanner height = new Scanner(System.in);
		System.out.println("Enter your height (in inches)");
		int heightInInches = height.nextInt();
		
		if(heightInInches <60) {
			System.out.println("You are short");
		} else if (heightInInches >=60 && heightInInches<=72) {
			System.out.println("You are medium height");
		} else {
			System.out.println("You are tall");
		}
		
	}

}
