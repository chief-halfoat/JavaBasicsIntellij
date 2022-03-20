package lee.alex.basics;

import java.util.Scanner;

public class TryCatchJavaExamples {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		System.out.println("What's your favorite number?");
//		try {
//			int favNum = scan.nextInt();
//			System.out.println(favNum);
//		} catch (Exception e) {
//			System.out.println("Sorry, please enter a number!");
//		}
		
		try {int[] a = null;
		System.out.println(a[1]);
		}	catch (Exception e) {
			System.out.println("");
		}
		}
}
