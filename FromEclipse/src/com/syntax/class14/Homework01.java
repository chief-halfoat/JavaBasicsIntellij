package com.syntax.class14;

import java.util.Scanner;

//Accept username, password and confirm password from a user and check following requirements:
//Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
//Password should be minimum 8 characters, if less → message=”Password is too short”.
//Password cannot contain username if so, → message=”Password cannot contain username”.
//Password should match confirmed password, if not  → message=“Passwords do not match”.
//Only after all requirements met → message “Your username and password has been created”

public class Homework01 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ins = new Scanner(System.in);
		System.out.println("Enter username:");
		String username = ins.nextLine();
		System.out.println("Enter password");
		String password = ins.nextLine();
		System.out.println("Re-enter password");
		String passwordReenter = ins.nextLine();

		if (username =="" || password == "") {
			System.out.println("Username and/or password cannot be blank");
		} else if (password.length()<8) {
			System.out.println("Password is too short");
		} else if (password.contains(username)) {
			System.out.println("Password cannot contain username");
		} else if (password.equals(passwordReenter)) {
			System.out.println("Your username and password has been created");
		} else {
			System.out.println("Passwords do not match");
		}
	
	ins.close();
	}

}
