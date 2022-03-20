package com.syntax.class04;

import java.util.Scanner;

public class Homework003 {

	public static void main(String[] args) {

		Scanner prompt = new Scanner(System.in);
		System.out.println("What city are you in?");
		String city = prompt.nextLine();

		System.out.println("What is the temperature in degrees fahrenheit?");
		int tempF = prompt.nextInt();

		double tempC = (tempF - 32) / 1.8;

		System.out.println("The temperature in the city of " + city + " is " + tempC + " degrees celsius.");

	}

}
