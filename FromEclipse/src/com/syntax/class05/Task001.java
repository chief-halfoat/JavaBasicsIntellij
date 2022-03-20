package com.syntax.class05;

import java.util.ArrayList;
import java.util.Scanner;

public class Task001 {

	public static void main(String[] args) {
		System.out.println("What day is today?");
		
		Scanner scan = new Scanner(System.in);
		
		String day = scan.nextLine();
		if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")) {
			System.out.println("There is no class today");
		} else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")) {
			System.out.println("There is manual testing class today");
		} else if (day.equalsIgnoreCase("Thursday")) {
			System.out.println("There is review class today");
		} else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
			System.out.println("There is Java class today");
		}

	}

}
