package com.syntax.class06;

import java.util.Scanner;

public class Task001 {

	public static void main(String[] args) {

		/*
		 * 
		 */
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("What country are you from?");
		String country = input.nextLine();
		
		String language = "";
		
		switch(country.toLowerCase()){
		case "america":
			language = "English";
			break;
		case "france":
			language = "French";
			break;
		case "italy":
			language = "Italian";
			break;
		case "canada":
			language = "English and French";
			break;
		case "russia":
			language = "Russian";
			break;
			default :
				language = "Unknown";
		}
		
		System.out.println(language);
		
	}

}
