package com.syntax.class12;

public class Horse {

	String name;
	String breed;
	int age;
	double weight;
	
	void run() {
		System.out.println(name+" is running");
	}
	
	void eat() {
		System.out.println(name+" is eating");
	}
	void printCompleteInfo() {
		System.out.println("Name =  "+name);
		System.out.println("breed = "+breed);
		System.out.println("age = "+age);
		System.out.println("weight = "+weight);
	}
	
	
	public static void main(String[] args) {

		Horse pegasus = new Horse();
		pegasus.name="pegasus";
		pegasus.breed="Andalusian";
		pegasus.age=20;
		pegasus.weight=450;
		
		pegasus.run();
		pegasus.printCompleteInfo();
	}

}
