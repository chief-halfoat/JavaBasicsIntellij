package hart.john.personal;

public class Bottles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int n = 99;
		for (int i=99; i>0; i--) {
			System.out.println(i+" bottles of beer on the wall");
			System.out.println(i+" bottles of beer!");
			System.out.println("Take one down, pass it around");
			System.out.println((i-1)+" bottles of beer on the wall");
			System.out.println();
		}
	}

}
