package com.syntax.class12;

import java.util.Scanner;

public class NameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ins = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = ins.next();
		System.out.println("What is your job title?");
		String job = ins.next();
		System.out.println("What is your partner's name?");
		String partnerName = ins.next();

		Name test = new Name();

		test.helloName(name);
		test.job(job);
		test.partner(partnerName);

		ins.close();

	}

}
