package com.syntax.class02;

public class NonPrimitiveType {

	public static void main(String[] args) {

		String name="Aizhan";
	
		String lastName ="Abenova";
		
		long phoneNumber =1234567890;
		
		String mobileNumber="123-456-7890";
		
		String num="123";
		int num1=123;
		
		String greeting="Hello Friends!";

		System.out.println(greeting);
		
		//typing syso and then hitting ctrl+space will 
		//auto-complete System.out.print()
		
		System.out.println(name);
		System.out.println(lastName);
		
		System.out.println(name+" "+lastName);
		
		/*using + we can concatenate
		 * 	String + String
		 * String + int
		 * String + boolean
		 * String + double, char, etc...
		 */
		
		int age=25;
		
		System.out.println(name+" is "+age+" years old");
		
		String address="123 Test Street";
		
		//I live at 123 Test Street
		
		System.out.println("I live at "+address);
		
		String feeling ="like";
		
		String food = "kebab";
		
		System.out.println("I "+feeling+" "+food);
		
		feeling="love";
		food="shrimp";
		
		System.out.println("I "+feeling+" "+food);
		
		//Aizhan is 25 years old
		
		//keywords have reserved rules
		//all keywords start with a lowercase letter
		//String is considered a class, not a keyword
		//anytime a value has multiple characters use a string

	
		
	}

}
