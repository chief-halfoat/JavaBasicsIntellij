package lee.alex.basics;

import java.util.Scanner;

public class ScannerDeep {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scan.next();
		
		System.out.println("How old are you?");
		int age = scan.nextInt();
		System.out.println("What is your senior quote?");
		String quote = scan.next();
		quote += scan.nextLine();
		
		System.out.println("Thank you, "+name+"! You are "+age+" years old and your senior quote is \""+quote+"\"");
		
	}

}
