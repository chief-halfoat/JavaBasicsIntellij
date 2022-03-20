package com.syntax.class02;

public class ArithmeticalOperators {

	public static void main(String[] args) {

		//+,-,*,/,%
		//only work with numerical operators
		
		int num1=10;
		int num2=3;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		double num3=10;
		double num4=6;
		
		System.out.println(num3/num4);
		System.out.println("    *********     ");
		float num5=10f;
		float num6=6f;
		
		System.out.println(num5/num6);
		
		//% is a remainder operator
		
		int i=10;
		int j=5;
		
		System.out.println(i%j);
		
		int n1=20;
		int n2=3;
		
		int sum=n1+n2;
		System.out.println(sum);
		//assignment operator always has action on right 
		//happening first
		int sub=n1-n2;
		System.out.println(sub);
		int div=n1/n2;
		System.out.println(div);
		int rem=n1%n2;
		int mult=n1*n2;
		System.out.println(rem);
		System.out.println(mult);
		
		double d1=20;
		double d2=3;
		
		double div1=d1/d2;
		System.out.println(div1);
	
		
		
	}

}
