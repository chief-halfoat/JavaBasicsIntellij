package lee.alex.basics;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = scan.nextLine();
		
		System.out.println("What is your middle name?");
		String middleName = scan.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = scan.nextLine();
		
		System.out.println("Where were you born?");
		String birthCity = scan.nextLine();
		
		System.out.println("What year were you born?");
		String birthYear = scan.nextLine();
		
		System.out.println("What high school did you attend?");
		String highSchool = scan.nextLine();
		
		System.out.println("What year did you graduate from High School?");
		String highSchoolGradYear = scan.nextLine();
		
		System.out.println("What college did you attend?");
		String college = scan.nextLine();
	
		System.out.println("What degree did you earn?");
		String collegeDegree = scan.nextLine();
			
		System.out.println("What was your major?");
		String collegeMajor = scan.nextLine();
		
		System.out.println("What Year did you graduate from College?");
		String collegeGradYear = scan.nextLine();
		
		System.out.println("What is your Career Field?");
		String careerField = scan.nextLine();
		
		System.out.println("What is your Spouse\'s Name?");
		String spouseName = scan.nextLine();
		
		System.out.println("What year were you married?");
		String yearMarried = scan.nextLine();
		
		System.out.println(firstName+" "+middleName+" "+lastName+" was born in "+birthCity+" in "+birthYear+".");
		System.out.println(firstName+" attended "+highSchool+" and graduated in "+highSchoolGradYear+".");
		System.out.print(firstName+" then attended "+college+" graduating with a "+collegeDegree+" in "+collegeMajor+" in "+collegeGradYear+".\n"+firstName+" went on to a successful career in "+careerField+" and married "+spouseName+" in "+yearMarried+".");
		
	}
	}
