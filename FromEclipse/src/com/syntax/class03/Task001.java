package com.syntax.class03;

public class Task001 {
public static void main(String[] args) {

//	Declare variable and increase it’s value by 500 and then by 200 using shorthand operator 
//	Declare variable and decrease it’s value by 60 using shorthand operator
//	Declare variable cakePiece=11 and divide the value of that variable between 4 people using shorthand operator
//	Declare variable cake=25 and divide cake between 7 people . 
	// Using shorthand operator found out how many pieces of cake left after it was
	// distributed equally among 7 people

	int numPlus=100;
	numPlus+=500;
	numPlus+=200;
	System.out.println(numPlus);
	int numMinus=100;
	numMinus-=60;
	System.out.println(numMinus);
	int cakePiece=11;
	cakePiece/=4;
	System.out.println(cakePiece);
	int cake=25;
	cake%=7;
	System.out.println(cake);
	
	}
}
