package com.syntax.review04;

public class Task02 {

	public static void main(String[] args) {
		// Create a loop to print a pattern
		//1
		//12
		//123
		//1234
		//12345
		
		for (int i=1; i<6; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j);
			} System.out.println();
		}
	}

}
