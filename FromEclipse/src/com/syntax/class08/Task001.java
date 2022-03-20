package com.syntax.class08;

public class Task001 {

	public static void main(String[] args) {

		//Sum of all even numbers between 1 & 50
		
		int sumEven = 0;
		
		for (int i=0; i<=50; i+=2) {
			sumEven+=i;
		}
		System.out.println(sumEven);
		
		//Sum of all odd numbers between 1 & 50
		
		int sumOdd = 0;
		
		for (int j=1; j<=50; j+=2) {
			sumOdd+=j;
		}
		System.out.println(sumOdd);

	int sumEven2 = 0;
	int sumOdd2 = 0;
	
	for (int k = 1; k<=50; k++) {
		if (k%2==0) {
			sumEven2 = sumEven2  + k;
		} else {
			sumOdd2 = sumOdd2+k;
		}
	}
	System.out.println("The sum of all even numbers is "+sumEven2+" and the sum of all odd numbers is "+sumOdd2);
	
	}

}
