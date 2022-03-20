package com.w3schools.java;

import java.util.Scanner;

public class MethodIfElse {
	static void checkAge(int age) {
		if (age<18) {
			System.out.println("Access Denied!");
		} else {
			System.out.println("Access Granted");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("How old are you?");
		
		int age = scan.nextInt();
		checkAge(age);
	}
}
