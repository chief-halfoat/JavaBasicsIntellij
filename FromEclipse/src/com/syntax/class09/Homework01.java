package com.syntax.class09;

public class Homework01 {

	public static void main(String[] args) {
//		Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

		String[] cars = {"Honda", "Toyota", "Ford", "Chevy", "Hyundai", "Opel"};
		
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		for (String car:cars) {
			System.out.println(car);
		}

	}

}
