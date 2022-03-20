package com.syntax.class05;

import java.util.Scanner;

public class Homework002 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Using a number, what day of the week is it?");

		int day = input.nextInt();

//	int day = 0;
//		
//		for (int i = 0; i<8; i++) {
//			day = i;

		if (day >= 1 && day <= 5) {
			System.out.println("It is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend day");
		} else {
			System.out.println("Invalid day");
		}
	}

}
