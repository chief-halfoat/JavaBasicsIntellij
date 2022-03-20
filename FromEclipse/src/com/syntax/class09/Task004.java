package com.syntax.class09;

public class Task004 {

	public static void main(String[] args) {
//		Create an array of names and store all names of your group. 
//		Then print your name from that array. (use 2 different ways of creating an array).

		String[] names = new String [12];
		names [0] = "John";
		names [1] = "Hart";
		names [2] = "Adam";
		names [3] = "Powolski";
		names [4] = "Jose";
		names [5] = "Lovo";
		names [6] = "Andrew";
		names [7] = "McMullin";
		names [8] = "Joe";
		names [9] = "Smith";
		names [10] = "Steve";
		names [11] = "Rogers";
		
		System.out.println(names [0]+" "+names [1]);
		
		String [] names1 = {"John", "Hart", "Adam", "Powolski", "Jose", "Lovo", "Andrew", "McMullin", "Joe", "Smith", "Steve", "Rogers"};
		System.out.println(names1[0]+" "+names1[1]);
		}
		
		
	
	}


