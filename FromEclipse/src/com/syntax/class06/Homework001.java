package com.syntax.class06;

import java.util.Scanner;

public class Homework001 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n1 = input.nextInt();
		System.out.println("Enter another number");
		int n2 = input.nextInt();
		System.out.println("Enter a mathematical operator (+, -, /, *)");
		String op = input.next();
		
		int ans = 0;
		if (op.equals("+")) {
			ans = n1 + n2;
		} else if (op.equals("-")) {
			ans = n1 - n2;
		} else if (op.equals("/")) {
			ans = n1/n2;
		} else if (op.equals("*")) {
			ans = n1 * n2;
		} else {
			System.out.println("Error");
		}
		
		System.out.println(n1+op+n2+"="+ans);
		
	}

}
