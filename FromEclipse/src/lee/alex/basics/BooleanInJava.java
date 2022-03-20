package lee.alex.basics;

public class BooleanInJava {

	public static void main(String[] args) {
//		
//		int a = 2;
//		boolean b = a == 2;
//		
//		System.out.println(b);
//		
//		a=3;
//		b=a==2; 
//		System.out.println(b); 
	
		boolean passedDoor = true;
		boolean missedDoor = false;
		boolean passedAllDoors = false;
		int doorCount = 0;
		
		if(passedDoor) {
			System.out.println("We passed the first door!");
			doorCount = doorCount+1;
		}
		
		if(passedDoor) {
			System.out.println("We passed the second door!");
			doorCount = doorCount + 1;
		}
		
		if(passedDoor) {
			System.out.println("We passed the third door!");
			doorCount = doorCount + 1;
		}
		
		if(doorCount == 3) {
			passedAllDoors = true;
		}
		
		if(passedAllDoors) {
			System.out.println("Congratulations! You won the program!");
		}
		
	}
}
