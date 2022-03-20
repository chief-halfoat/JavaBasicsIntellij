package com.syntax.class13;

public class Homework04 {

//	Create a method createEmail(). 
//	Based on values of users name, lastName and email type, 
//	your method should return complete email Address. 
//	Example:  createEmail(John, Snow, gmail) → 
//	johnsnow@gmail.com  

	String createEmail(String name, String lastName, String emailType) {
		return name.toLowerCase() + lastName.toLowerCase() + "@" + emailType.toLowerCase() + ".com";
	}

	public static void main(String[] args) {

		Homework04 obj = new Homework04();
		System.out.println(obj.createEmail("John", "Hart", "gmail"));
		System.out.println(obj.createEmail("Steve", "Smith", "outlook"));
		System.out.println(obj.createEmail("Jiminy", "Cricket", "aol"));
		System.out.println(obj.createEmail("John", "Hart", "gmail"));

	}

}
