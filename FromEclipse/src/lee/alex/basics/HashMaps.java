package lee.alex.basics;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {

//		int a = 10;
//		int b = 3;
//		int c = 88;
//		
//		HashMap<String, Integer> happy = new HashMap<String, Integer>();
//		happy.put("a", 10);
//		happy.put("b", 3);
//		happy.put("c", 88);
//		
//		System.out.println(happy);

	HashMap<String, String> fun = new HashMap<String, String>();
	
	fun.put("bobbyJoe1996", "FluffyP0nies!");
	fun.put("helloKittyFan21", "AloeVera!");
	fun.put("coolguyswag", "password123");
	
	System.out.println(fun);
	
	fun.remove("helloKittyFan21");
	System.out.println(fun.containsValue("password123"));
	System.out.println(fun);
	
	}

}
