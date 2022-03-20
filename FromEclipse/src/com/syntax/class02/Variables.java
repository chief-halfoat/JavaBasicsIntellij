package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

		String firstName="John";
		String lastName="Hart";
		char grade='A';
		String city="Washington";
		String state="DC";
		String phoneNumber="202-867-5309";
		
		System.out.println("My name is "+firstName+" and my last name is "+lastName+".");
		System.out.println("I am an "+grade+" student.");
		System.out.println("I live in "+city+", "+state+".");
		System.out.println("And my phone number is "+phoneNumber);
		
		city="Tampa";
		state="Florida";
		phoneNumber="813-967-5309";
		
		System.out.println("My name is "+firstName+" "+lastName+" and I moved to a new city: "+city+" "+state+".");
		System.out.println("My new phone number is "+phoneNumber+".");
		
		
	}

}
