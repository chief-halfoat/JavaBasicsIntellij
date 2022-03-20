package com.w3schools.java;

public class ForEachArray {

	public static void main(String[] args) {
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
			System.out.println(i);
		}
		
		int [][] myNumbers = {{1,2,3,4}, {5,6,7,8}};
		for (int i=0; i<myNumbers.length; i++) {
			for (int j = 0; j<myNumbers[i].length; j++) {
				System.out.println(myNumbers[i][j]);
			}
		}
		
	}
}
