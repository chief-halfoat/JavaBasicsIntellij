package com.syntax.class13;

public class Homework05 {

//	Write a method to return whether given number is prime or not?

	static boolean isPrime(int n) {

		if (n <= 1)
			return false;
		else if (n == 2)
			return true;
		else if (n % 2 == 0)
			return false;
		for (int i = 3; i < n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		Homework05 obj = new Homework05();
		System.out.println(obj.isPrime(1));
		System.out.println(obj.isPrime(2));
		System.out.println(obj.isPrime(17));
		System.out.println(obj.isPrime(4));
		System.out.println(obj.isPrime(2022));

	}

}
