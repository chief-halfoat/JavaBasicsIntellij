package com.syntax.class13;

//Create  class Student that will have a method getGrade. 
//Your method should accept the score of a student 
//and return a grade:
//	score > 90 - A
//	score >80 - B
//	score >70 - C
//	score > 50 - D
//	anything else - F

public class Student {

	char getGrade(int n1) {
		if (n1>90) {
			return 'A';
		} else if (n1>80 && n1<=90) {
			return 'B';
		} else if (n1>70 && n1<=80){
			return 'C';
		} else if (n1>50 && n1<=70) {
			return 'D';
		} else {
			return 'F';
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student test = new Student();
		for (int i =101; i>=49; i--) {
			System.out.println("Your final score is "+i+" and your letter grade is "+test.getGrade(i));
		}
	
		
	}

}
