package com.syntax.class13;

public class Homework01 {

	// Create a method that will take 2 parameters as a numbers
	// and prints which number is larger.

	void larger(int n1, int n2) {
		if (n1 > n2) {
			System.out.println(n1 + " is the larger number");
		} else if (n2 > n1) {
			System.out.println(n2 + " is the larger number");
		} else {
			System.out.println("The numbers are the same");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Homework01 obj = new Homework01();

		obj.larger(200, 800);
		obj.larger(100, 50);
		obj.larger(0, 0);
	}

}
