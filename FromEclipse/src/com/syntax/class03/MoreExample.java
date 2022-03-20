package com.syntax.class03;

import java.util.Scanner;

public class MoreExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Are you hungry?");
		
		String hungry = scan.nextLine();
		boolean hangry = true;
		if (hungry.contains("Yes")) {
			hangry = true;
		} else {
			hangry = false;
		}
		
		
		if (hangry == true) {
			System.out.println("I am going to eat");
		} else {
			System.out.println("I am going to drink a tea");
		}
		
	}

}
