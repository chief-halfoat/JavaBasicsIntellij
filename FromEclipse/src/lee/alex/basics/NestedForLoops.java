package lee.alex.basics;

public class NestedForLoops {

	public static void main(String[] args) {
		
	String colors[] = {"Red", "Green", "Blue", "Purple", "Clear", "Polka-Dots"};
	
	for(int i = 0; i<colors.length; i++) {
		System.out.println(colors[i]);
	}
		
	System.out.println("-----------------");
	
	String[][]fancyColors = { {"red", "blue", "green"},
							{"cyan", "magenta", "turquiose"}};
							
	for(int i=0; i<2; i++) {
		for(int j=0; j<3; j++)
			System.out.println(fancyColors[i][j]);
	}
	
	System.out.println("+-+-+-+-+-+");
	
	for(int i=1; i<5; i++) {
		for(int j=1; j<5; j++) {
			System.out.println("i="+i+", j="+j);
		}
	}
	
	
	}
}
