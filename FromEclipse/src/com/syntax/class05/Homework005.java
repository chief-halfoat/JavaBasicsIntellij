package com.syntax.class05;

import java.util.Scanner;

public class Homework005 {

	public static void main(String[] args) {

		Scanner info = new Scanner(System.in);
		
		System.out.println("What was your score on the quiz?");
		int q = info.nextInt();
		System.out.println("What was your score on the mid-term?");
		int m = info.nextInt();
		System.out.println("What was your score on the final?");
		int f = info.nextInt();
		
		int g = (q+m+f)/3;
		System.out.println(g);
		
		if(g>=90) {
			System.out.println("You grade is an A");
		} else if (g>=70 && g<90) {
			System.out.println("Your grade is a B");
		} else if (g>=50 && g<70) {
			System.out.println("Your grade is a C");
		} else if (g<50) {
			System.out.println("Your grade is a F");
		}
		
	}

}
