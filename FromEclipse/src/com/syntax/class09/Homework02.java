package com.syntax.class09;

public class Homework02 {

	public static void main(String[] args) {
//		Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.

		String[] animals = { "Giraffe", "Aardvark", "Rhino", "Dog", "Cat" };

		for (int i = 0; i < animals.length; i++) {

			System.out.println(animals[i]);
		}

		for (String animal : animals) {
			System.out.println(animal);
		}

	}

}
