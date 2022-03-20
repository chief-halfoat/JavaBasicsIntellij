package com.syntax.class12;

public class Dog {

	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;

	void barks() {
		System.out.println("Dog is barking...");
	}

	void eat() {
		System.out.println("Dog is eating...");
	}

	void sleep() {
		System.out.println("Dog is sleeping...");
	}

	public static void main(String[] args) {

		//creating an object - "scooby" - from class Dog
		Dog scooby = new Dog();
		scooby.barks();
		scooby.eat();
		scooby.sleep();
	}

}
