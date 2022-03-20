package lee.alex.basics;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String name = "Billy Bob Joe";
		
		System.out.println("Name: "+name);
		System.out.println("Uppercase: "+name.toUpperCase());
		System.out.println("Lowercase: "+name.toLowerCase());
		System.out.println("first char: "+name.charAt(0));
		System.out.println("Length: "+name.length());
		System.out.println("Last char: "+name.charAt(12));
		System.out.println("Substring: "+name.substring(10, 13));
//		System.out.println("Substring A: "+name.subSequence(10, name.length));
		
		if(name.contains("Billy"));{
			System.out.println(name);
		}
		
		
		
	}	
}
