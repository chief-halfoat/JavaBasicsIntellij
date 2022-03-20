package lee.alex.basics;

import java.util.Scanner;

public class IfElseStatements2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a grade:");
		
		float n =scan.nextFloat();
		
		if(n >=90 && n<=100) {
			System.out.println("A");
		} else if(n>=80 && n<90) {
			System.out.println("B");
		} else if (n>=70 && n<80) {
			System.out.println("C");
		} else if (n>=65 && n<70) {
			System.out.print("D");
		} else if (n>=0 && n<65) {
			System.out.print("E");
		} else {
			System.out.print("The number you entered is not in the range");
		}
		
	}
	
}
