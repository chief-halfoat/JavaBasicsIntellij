package com.syntax.class05;

import java.util.Scanner;

public class Homework003 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Pick a number:");
	int n1 = input.nextInt();
	

	
//	for (int i = 0; i<1002; i++) {
//
//		int n1 = i;
//		System.out.println(n1);
//		
		if (n1>0 && n1<=10) {
		System.out.println("That is a small number");
	} else if (n1>10 && n1<=100) {
		System.out.println("That is a medium number");
	} else if (n1>100 && n1<=1000) {
		System.out.println("That is a large number");
	} else {
		System.out.println("Invalid number");
	}
	}
	

}
