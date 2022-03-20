package com.syntax.class10;

public class Task002 {

	public static void main(String[] args) {

		String[] countries = { "USA", "Morocco", "Canada", "England", "France", "Brazil" };
		String capital = "";
		for (String country : countries) {
			switch (country) {
			case "USA":
				capital = "Washington DC";
				break;
			case "Morocco":
				capital = "Casablanca";
				break;
			case "Canada":
				capital = "Ottawa";
				break;
			case "England":
				capital = "London";
				break;
			case "France":
				capital = "Paris";
				break;
			case "Brazil":
				capital = "Brasilia";
				break;
			}
			System.out.println(capital + ", " + country);
		}
		String country = "";
		for (int i = 0; i < countries.length; i++) {
			country = countries[i];
			switch (country) {
			case "USA":
				capital = "Washington DC";
				break;
			case "Morocco":
				capital = "Casablanca";
				break;
			case "Canada":
				capital = "Ottawa";
				break;
			case "England":
				capital = "London";
				break;
			case "France":
				capital = "Paris";
				break;
			case "Brazil":
				capital = "Brasilia";
				break;
			}
			System.out.println(capital + ", " + country);

		}
	}
}
