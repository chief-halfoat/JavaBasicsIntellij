package com.syntax.class15;

public class Task03 {
//
//	 Write a program that reads two people's first
//		names and if they expecting boy or girl? 
//	Based on the input suggests a name for a baby:
//	if girl, first half mother's name and second half father's name
//	if boy, first half father's name and second half of mother's name

	String babyName(String gender, String father, String mother) {
		String baby = "";
		if (gender.equalsIgnoreCase("boy")) {
			baby = father.substring(0, father.length() / 2) + mother.substring(mother.length() / 2);
		} else {
			baby = mother.substring(0, mother.length() / 2) + father.substring(father.length() / 2);

		}
		;

		return baby;
	}

	public static void main(String[] args) {

		Task03 obj = new Task03();

		System.out.println(obj.babyName("boy", "Johnathan", "Emily"));
		System.out.println(obj.babyName("girl", "John", "Emily"));
	}

}
