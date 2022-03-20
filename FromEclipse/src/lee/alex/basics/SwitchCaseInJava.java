package lee.alex.basics;

public class SwitchCaseInJava {

	public static void main(String[] args) {

		
		for (int i = 0; i<9; i++) {
		
		int day = i;
		
		

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Not a valid day number");
		}
	}
	}
}
