package lee.alex.basics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//Create a program to detect if a word is a palindrome
		
		Scanner ins = new Scanner(System.in);
		System.out.println("Is it a palindrome?");
		System.out.println("What word or phrase would you like to check?");
		
		String orig = ins.nextLine();
		orig = orig.replace(" ", ""); 
		orig = orig.replace(",","");
		orig = orig.toLowerCase();
		
		String reverse = "";
		for (int i=orig.length()-1; i>=0; i--) {
			reverse += orig.charAt(i);
			//System.out.println(reverse);
		}
		
		boolean palindrome = true;
		
		for (int i=0; i<orig.length(); i++) {
			if (orig.charAt(i)!=reverse.charAt(i)) {
				palindrome=false;
			}
		}
		
		if (palindrome==true) {
			System.out.println("You've got yourself a palindrome!");
		} else {
			System.out.println("whomp whomp");
		}
		ins.close();
	}

}
