package lee.alex.basics;

import java.time.LocalDate;
import java.time.Period;

public class AgeFromDate {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1987, 12, 02);
		int years = Period.between(birthDate, today).getYears();

		System.out.println(today);
		System.out.println(birthDate);
		System.out.println(years);
	}
}
