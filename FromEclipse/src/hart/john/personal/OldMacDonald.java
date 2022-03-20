package hart.john.personal;

import java.util.Scanner;

public class OldMacDonald {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("What kind of animal does Old MacDonald have?");
	String animal = scan.nextLine();
	String animalSound=null;
	
	switch (animal) {
	
	case "Cow":
		animalSound="Moo";
		break;
	case "Chicken":
		animalSound="Bock";
		break;
	case "Dog":
		animalSound="Woof";
		break;
		default:
			animalSound=null;
	
	
	}
	
	if (animalSound !=null) {		
		System.out.println("Old MacDonald had a farm!\nEIEIO!");
		System.out.println("And on this farm he had a "+animal+"!");
		System.out.println("EIEIO!");
		System.out.print("With a "+animalSound+" "+animalSound+"!");
		System.out.println(" here and a "+animalSound+" "+animalSound+"! there!");
	} else {
		System.out.println("Whoops!");
}
	}
}
