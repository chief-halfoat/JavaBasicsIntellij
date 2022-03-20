package lee.alex.basics;

import java.util.Scanner;

public class IfElseStatements {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);	
	System.out.println("Enter a grade (Number between 0 and 100):");	

	int n = scan.nextInt();
//	System.out.println(n);
	
	if(n>= 90 && n<=100) {
		System.out.println("A");
	}
	if(n>=80 && n<90) {
		System.out.println("B");
	}
	
	if(n>=70 && n<80) {
		System.out.println("C");
	}
	
	if(n>=60 && n<70 ) {
		System.out.println("D");
	}
	
	if(n>=0 && n<60) {
		System.out.println("E");
	}
	
	}
}
