package com.syntax.class12;

public class Dog1 {
	//Create a Dog Class and create 3 different objects of it:
	//Husky, Bulldog, Labrador  with specific  attributes and behaviors.

	String name;
	String color;
	String breed;
	
	int age;
	double weight;

	void barks() {
		System.out.println(name+" is barking...");
	}

	void eat() {
		System.out.println(name+" is eating...");
	}

	void sleep() {
		System.out.println(name+" is sleeping...");
	}
	
	void completeInfo() {
		System.out.println("Your dog is named "+name);
		System.out.println(name+" is a "+color+" "+breed);
	
		System.out.println(name+" is "+age+" years old and weighs "+weight+"lbs.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog1 snow = new Dog1();
		snow.name = "Snowball";
		snow.color = "Gray";
		snow.breed = "Husky";
		snow.age = 8;
		snow.weight = 120;
		
		snow.barks();
		snow.completeInfo();

		Dog1 bull = new Dog1();
		bull.name = "Bugs";
		bull.color = "White";
		bull.breed = "Bulldog";
		bull.age = 4;
		bull.weight = 55;
		
		bull.eat();
		bull.completeInfo();
		
		Dog1 lab = new Dog1();
		lab.name = "Stella";
		lab.color = "Golden";
		lab.breed = "Labrador";
		lab.age = 1;
		lab.weight = 45;
		
		lab.eat();
		lab.completeInfo();
	
	}

}
