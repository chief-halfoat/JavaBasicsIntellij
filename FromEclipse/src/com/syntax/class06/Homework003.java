package com.syntax.class06;

import java.util.Scanner;

public class Homework003 {

	public static void main(String[] args) {

		Scanner ask = new Scanner(System.in);
		
		System.out.println("Is there a sale?");
		String sale = ask.next();
		
		String shopping = "";
		
		switch(sale.toLowerCase()) {
		case "yes":
			shopping = "yes";
			break;
		case "no":
			shopping = "You are not going shopping.";
			break;
			
			default:
				System.out.println("Error");
		}
		
//		int priceRegular = 0;
		double priceSale = 0;
		
		if (shopping.equals("yes")) {
			System.out.println("What is the price of the item?");
			int priceRegular = ask.nextInt();
			
			if (priceRegular <20) {
				priceSale = priceRegular*.9;
			} else if (priceRegular >=20 && priceRegular <100) {
				priceSale = priceRegular*.8;
			} else if (priceRegular >= 100 && priceRegular<500) {
				priceSale = priceRegular*.7;
			} else if (priceRegular>=500) {
				priceSale = priceRegular*.5;
			} else {
				System.out.println("Error");
			}
			
			System.out.println("After discount, the price of the item reduces from $"+priceRegular+" to $"+priceSale);
		} else {
			System.out.println("You are not going shopping.");
		}
		
		
	}

}
