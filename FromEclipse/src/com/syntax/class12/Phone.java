package com.syntax.class12;

public class Phone {

//	Create a Class “Phone”. Create 3 Objects of it: 
//		iPhone, Pixel, Nokia with specific  attributes and behaviors.

	String brand;
	String model;
	int year;
	int storage;
	double price;

	void phone() {
		System.out.println("You have a " + model + " from " + brand + ".");
	}

	void phoneSpecs() {
		System.out.println("Your phone was made in " + year + " and it has " + storage + "gB of storage");
	}

	void cost() {
		System.out.println("It cost " + price);
	}

	public static void main(String[] args) {

		Phone johnsPhone = new Phone();
		johnsPhone.brand = "Google";
		johnsPhone.model = "Pixel";
		johnsPhone.year = 2020;
		johnsPhone.storage = 128;
		johnsPhone.price = 799.00;

		johnsPhone.phone();
		johnsPhone.phoneSpecs();
		johnsPhone.cost();

		Phone stevesPhone = new Phone();
		stevesPhone.brand = "Apple";
		stevesPhone.model = "iPhone 11";
		stevesPhone.year = 2021;
		stevesPhone.storage = 64;
		stevesPhone.price = 2000;

		stevesPhone.phone();
		stevesPhone.phoneSpecs();
		stevesPhone.cost();

		Phone billsPhone = new Phone();
		billsPhone.brand = "Nokia";
		billsPhone.model = "3310";
		billsPhone.year = 2000;
		billsPhone.storage = 1;
		billsPhone.price = 200;

		billsPhone.phone();
		billsPhone.phoneSpecs();
		billsPhone.cost();
	}

}
