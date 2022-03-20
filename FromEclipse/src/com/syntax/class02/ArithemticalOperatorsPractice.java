package com.syntax.class02;

public class ArithemticalOperatorsPractice {

	public static void main(String[] args) {

		//Practice for Java Arithmetical Operators
		
		//Basics
		
		int num1=7;
		int num2=5;
		double num3=7;
		double num4=5;
		
		int sum=num1+num2;
		int diff=num1-num2;
		int prod=num1*num2;
		double quot=num3/num4;
		int modu=num1%num2;
		//int incr=++num1;
		int decr=--num1;
		
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(prod);
		System.out.println(quot);
		System.out.println(modu);
		//System.out.println(incr);
		System.out.println(decr);
		
		System.out.println("     **********     ");
		//Assignment Operators
		
		int x=10;
		x+=3;
		System.out.println(x);
		
		x=10;
		x-=3;
		System.out.println(x);
		x=10;
		x*=3;
		System.out.println(x);
		x=10;
		x/=3;
		System.out.println(x);
		x=10;
		x%=3;
		System.out.println(x);
		x=10;
		x&=3;
		System.out.println(x);
		x=10;
		x|=3;
		System.out.println(x);
		x=10;
		x^=3;
		System.out.println(x);
		x=10;
		x>>=3;
		System.out.println(x);
		x=10;
		x<<=3;
		System.out.println(x);
	}	
}
