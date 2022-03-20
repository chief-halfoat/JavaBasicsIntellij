package lee.alex.basics;

public class MethodsInJava {

	public static void main(String[] args) {
	
		welcome();
		multiply(5,10);
		multiply(2,3);
		multiply(6,8);
		divide(8,2);
		divide(6,3);
		divide(3,6);
		
	}
	
	public static void welcome() {
		System.out.println("Welcome to our calculator!");
	}
	
	public static void multiply(int a, int b) {
		System.out.println(a*b);
	}
	public static void divide(double a, double b) {
		System.out.println(a/b);
	}
		
	}

