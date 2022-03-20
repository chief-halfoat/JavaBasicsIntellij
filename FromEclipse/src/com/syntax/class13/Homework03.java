package com.syntax.class13;

public class Homework03 {

	//Create a method that will say Hello in different language 
	//based on the country that will passed when method is executed.
	

	void localHello (String country) {
		if (country.equalsIgnoreCase("USA")) {
			System.out.println("Hello!");
		} else if (country.equalsIgnoreCase("France")) {
			System.out.println("Bonjour!");
		} else if (country.equalsIgnoreCase("Spain")) {
			System.out.println("Hola!");
		} else if (country.equalsIgnoreCase("Germany")) {
			System.out.println("Guten Tag!");
		} else {
			System.out.println("I don't know");
		}

	}	
	
//	String countryLanguage (String country) {
//		if (country.equalsIgnoreCase("USA")) {
//			return "Hello";
//	} else if (country.equalsIgnoreCase("France")) {
//		return "Bonjour";
//	} else if (country.equalsIgnoreCase("Spain")) {
//		return "Hola";
//	} else {
//		return "I don't know";
//	}
//		
//	}
	
	public static void main(String[] args) {

		Homework03 obj = new Homework03();
//		System.out.println("Language is "+obj.countryLanguage("USA"));
//		System.out.println("Language is "+obj.countryLanguage("Canada"));
//		System.out.println("Language is "+obj.countryLanguage("Spain"));
//		System.out.println("Language is "+obj.countryLanguage("France"));
		
		obj.localHello("usa");
		obj.localHello("france");
		obj.localHello("spain");
		obj.localHello("germany");
		obj.localHello("italy");
		obj.localHello("GERMANY");
		
		
	}

}
