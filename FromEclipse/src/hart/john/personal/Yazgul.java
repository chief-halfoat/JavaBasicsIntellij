package hart.john.personal;

public class Yazgul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		int evenRowSum = 0;
		for (int i=0; i<a.length; i+=2) {
			for (int j =0; j<a[i].length; j+=2) {
				evenRowSum += a[i][j];
				
			}
		}
		System.out.print(evenRowSum);	
	}

}
