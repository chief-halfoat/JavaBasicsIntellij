package com.syntax.class13;

public class Homework02 {

	//Create a method that will take a number and 
	//prints whether the number is even or odd.
	
//	boolean evenOrOdd (int n1) {
//		if (n1%2==0) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	void evenOrOdd (int n1) {
		if (n1%2==0) {
			System.out.println(n1+" is an even number");
		} else {
			System.out.println(n1+" is an odd number");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Homework02 obj = new Homework02();
//		
//		if (obj.evenOrOdd(5)==true) {
//			System.out.println("That is an even number");
//		} else {
//			System.out.println("That is an odd number");
//		}

		Homework02 obj = new Homework02();
		obj.evenOrOdd(27);
		obj.evenOrOdd(24);
		obj.evenOrOdd(0);
	
	}

}
