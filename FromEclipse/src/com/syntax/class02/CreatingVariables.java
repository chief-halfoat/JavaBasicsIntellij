package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		
		/* create a variable and assign value
		 * 
		 * declare a variable and initialize
		 */
		int age=25;
		
		int num; //declare variable
		num=10; //initialize it
		num=100;//reassign the value

		int n1, n2, n3; //all 3 variables are of the int type
		
		n1=10;
		n2=20;
		n3=30;
		//ctrl+d will remove entire line
	
		//Can I change a value of the variable?
		age=26; //reassigning the value of variable age
		//age=26.5; data type error
		
		age =57;
		age =75;
		System.out.println(age);
		
		age =100;
		System.out.println(age);//26
		
		//Java rules for identifiers
		
		//boolean break=false; ERROR 1. do not use keyword as identifier
		//char 1character='A'; ERROR 2. do not start identifiers with numbers
		
		//double %value=12.99; ERROR 3. do not start identifier with special characters
	
		//Java allows to use _ OR $ as identifier
		
		double $price=1.99;
		double _value=2.99;
				
		//not rules, but we prefer to follow
		
		/* variable and method names should start with lowercase
		 * give variables a meaningful name
		 * 
		 * class names should start with uppercase
		 * 
		 * if name has 2 or more words, follow camel casing
		 */
		
		int bigNumber =132425;
		
		char character1='a';
		
		boolean Break=true;
		
		
	}

}
