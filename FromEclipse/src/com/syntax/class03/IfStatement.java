package com.syntax.class03;

public class IfStatement {
public static void main(String[] args) {
	
	int num1=100;
	int num2=50;
	
	if (num1>num2) {
		System.out.println(num1+" is larger than "+num2);
	}
	if (num1<num2) {
		System.out.println(num1+"is smaller than "+num2);
	}
	
	double money = 5;
	double coffee = 4.99;
	
	if (money>=coffee) {
		System.out.println("I am buying coffee");
	} else {
		System.out.println("I am not buying coffee");
	}
	
	int temp=45;
	if (temp>45) {
		System.out.println("I am going for a walk");
	} else {
		System.out.println("I am staying at home");
	}

	char gender = 'm';
	if (gender == 'f') {
		System.out.println("Please use the front of the train");
	} else {
		System.out.println("Please use the back of the train");
	}

}
}
