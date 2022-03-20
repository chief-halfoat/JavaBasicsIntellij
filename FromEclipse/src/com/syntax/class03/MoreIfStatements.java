package com.syntax.class03;

import java.util.Scanner;

public class MoreIfStatements {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What day is today?");
		String day = scan.nextLine();
		
		if (day.equals("Saturday")) {
			System.out.println("I am having Java class today");
		} else {
			System.out.println("I don't know which class I have.");
		}
		
	}

}
