package lee.alex.basics;

public class Arrays2DPractice {

	public static void main(String[] args) {
		
		String [][] nameGenerator = {
				{"John", "Jacob", "Justin", "Jordan"},
				{"Fitzgerald", "Julian", "Douglas", "Matthew"},
				{"Horner", "Hart", "Cann", "Kuykendall"}
				};
		
		for (int n=0; n<3; n++) {
			for(int l=0; l<3; l++) {
				System.out.println(nameGenerator[n][l]);
			}
		}
	}
}
