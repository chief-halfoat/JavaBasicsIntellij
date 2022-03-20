package com.syntax.class13;

public class MethodsDemo3 {

	int squareTheNumber(int number) {
		return number*number;
	}
	
	int returnTheSameNumber(int number) {
		return number;
	}
	//create a method that takes a persons name and 
	//an animal name
	//if person's name is "Teyfur" and if animal is "Horse"
	//it returns us "camel"

	String getProperAnimalByExpert(String expertName, String animalName) {
		if ("Teyfur".equals(expertName) && "Horse".equals(animalName)) {
			return "camel";
		} else if ("Horse".equals(animalName)) {
			return "horse";
		} else {
			return "idk";
		}
	}
	
	//create a method that takes a boolean isSaleOn
	//double price and double discount
	//if isSaleOn == true apply discount to price
	
	double price;
	double discount;
	double isSaleOn(boolean sale, double price, double discount) {
		if (sale == true) {
			return price*discount;
		} else {
			return price;
			}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		MethodsDemo3 obj = new MethodsDemo3();
//		int result = obj.squareTheNumber(5);
//		System.out.println(result);
//
//		System.out.println(obj.getProperAnimalByExpert("Teyfur", "Horse"));
//		System.out.println(obj.getProperAnimalByExpert("John", "Horse"));
//		System.out.println(obj.getProperAnimalByExpert("John", "Camel"));
//		
		System.out.println("Your price is "+obj.isSaleOn(false, 9.99, .75));
		System.out.println("Your price is "+obj.isSaleOn(true, 9.99, .75));
	
	
	}

}
