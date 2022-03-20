package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		//Nested if - if inside another if
		
		boolean vaccine=true;
		int dose=0;
		
		if (vaccine) {
			System.out.println("How many doses do you have?");
			if (dose == 1) {
				System.out.println("You need another shot");
			} else {
				System.out.println("You are fully vaccinated");
			}
		} else {
			System.out.println("I do not have any further questions.");
		}
	
		
		System.out.println("*************************");
		
		boolean allergy = true;
		if(allergy) {
			System.out.println("Let's check what allergies you have");
			
			String allergyType="pollen";
			
			if (allergyType.equals("pollen")) {
				System.out.println("Please stay home when trees are blooming");
			}
		
		} 
		
		
	}

}
