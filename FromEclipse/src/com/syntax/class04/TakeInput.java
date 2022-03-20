package com.syntax.class04;

import java.util.Scanner;

//to import in Windows : ctrl+shift+o

public class TakeInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your country of origin:");

		String country = scan.next();
		System.out.println("You are from "+country);
		if (country.equalsIgnoreCase("USA")){
			System.out.println("You speak English");
		} else if (country.equalsIgnoreCase("France")) {
			System.out.println("You speak French");
		} else if (country.equalsIgnoreCase("Turkey")){
			System.out.println("You speak Turkish");
		} else {
			System.out.println("You speak a a different language");
		}
			
		
		
	}

}
