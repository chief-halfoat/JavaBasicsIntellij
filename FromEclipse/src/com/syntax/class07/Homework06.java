package com.syntax.class07;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		
		//Declare a variable to store a price for a coffee. 
		//Ask user to pay for a coffee. Keep asking to pay 
		//for coffee until user enters exact amount . 
		//If user give more than $3 --> ask them to give less, 
		//if user gives less money then ask to give more. 
		//Once user got a write amount print “Please enjoy your candy”

		double price=3;
		
		Scanner input = new Scanner(System.in);
		System.out.println("How much are you paying me for your coffee?");
		double payment = input.nextDouble();
		
		while (payment!=price) {
			if (payment>price) {
				System.out.println("Please give less money");
			} else {
				System.out.println("Please give more money");
			}
			
			System.out.println("How much are you paring me for your coffee?");
			payment = input.nextDouble();
		}

		System.out.println("Please enjoy your coffee.");
	}

}
