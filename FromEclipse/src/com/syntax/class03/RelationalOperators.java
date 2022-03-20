package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
	
	//assignment =
	//arithmetical +,-,/,*
	//relational ==, >, >=, <, <=, !+
	//relational is always boolean(T/F)
		
		int num1=10;
		int num2=16;
		
		System.out.println(num1>num2);
		System.out.println(num1==num2);
		System.out.println(num1<num2);
		
		boolean result = num1!=num2;
		System.out.println("Result is "+result);
		
		System.out.println(num1=num2);
		System.out.println(num1==num2);
		
		
		
	}
}
