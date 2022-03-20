package com.syntax.class07;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ask a user to enter name, last name and age 5 times.
		// Every time your program should print those values in a format
		// “You name is _ _ and you are _ years old’

		Scanner what = new Scanner(System.in);

	for (int i=1; i<=5; i++) {
		
		System.out.println("Enter first name");
		String name = what.next();
		
		System.out.println("Please enter last name");
		String lastName = what.next();
		
		System.out.println("Enter your age");
		int age = what.nextInt();
		
		System.out.println("Your name is "+name+" "+lastName+" and you are "+age+" years old");
	}
	
	
	}
}
