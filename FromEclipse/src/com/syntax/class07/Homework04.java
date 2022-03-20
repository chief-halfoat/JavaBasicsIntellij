package com.syntax.class07;

public class Homework04 {

	public static void main(String[] args) {

		//Print odd numbers between 20 and 50 (2 ways)

	int l = 20;
	while (l<=50) {
		if (l%2!=0) {
			System.out.print(l+" ");
		} l++;
	}
	System.out.println();
	System.out.println("---------------------------------------------");
	int m = 21;
	while (m<=50) {
		System.out.print(m+" ");
		m+=2;
	}
	
	}

}
