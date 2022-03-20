package hart.john.personal;

public class VariableCasting {
	public static void main(String[] args) {
		
		double myDouble=9.78;
		int myInt= (int) myDouble;
		
		System.out.println(myDouble);
		System.out.println(myInt);
		
		myDouble=myInt;
		System.out.println(myDouble);
		System.out.println(myInt);
		
		int x = 9;
		x &= 3;
		System.out.println(x);
	}
}
