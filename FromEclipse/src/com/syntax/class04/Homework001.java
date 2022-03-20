package com.syntax.class04;

import java.util.Scanner;

public class Homework001 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How much money do you need?");

		int loanNeeded = scan.nextInt();

		if (loanNeeded <= 200000) {
			System.out.println("We will lend them the money");
		} else {
			System.out.println("Unfortunately, we cannot lend them the money");
		}

	}

}
