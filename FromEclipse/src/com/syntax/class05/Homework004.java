package com.syntax.class05;

import java.util.Scanner;

public class Homework004 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What is the current time (Please use 24 hr format)");
		double time = scan.nextDouble();

//		for (int i =0; i <26; i++) {
//			int time = i;
//			System.out.println(time);
		
		if (time >= 0 && time < 12) {
			System.out.println("It is morning");
		} else if (time >= 11 & time < 16) {
			System.out.println("It is afternoon");
		} else if (time >= 16 && time < 20) {
			System.out.println("It is evening");
		} else if (time >= 21 && time < 24) {
			System.out.println("It is night");
		} else {
			System.out.println("Invalid time");
		}

	}
}
