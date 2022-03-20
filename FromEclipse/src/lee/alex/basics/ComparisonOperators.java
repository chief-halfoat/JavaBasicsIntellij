package lee.alex.basics;

public class ComparisonOperators {

	public static void main(String[] args) {
	
		// == is equal to
		// <= less than or equal to
		// < less than
		// > greater than
		// >= greater than or equal to
		// != not equal to
		// || OR
		
		
//		int a = 5;
//		int b = 4;
//		
//		boolean c = (a == b);
//		
//		System.out.println(c);
//		
		
		double a  = 120;
		
		if(a == 2.4) {
			System.out.println("They are equal!");
		}
		
		if(a > 7) {
			System.out.println("Greater than 7");
		}
		
		if(a == 2.4 || a==2.5) {
			System.out.println("a is 2.4 or 2.5");
		}
		if (a>=0 && a<=100) {
			System.out.println("a is in the range");
		} else {
			System.out.println("a is not in the range");
		}
		
		
	}
}
