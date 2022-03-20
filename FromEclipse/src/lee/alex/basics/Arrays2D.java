package lee.alex.basics;

public class Arrays2D {

	public static void main(String[] args) {
		
		int[][] lotteryCard = {{20,15,7},
								{8, 7, 19},
								{7, 13, 47}
		};
		
		System.out.println(lotteryCard[0][0]);
		
		System.out.println("-------------");
		
		for(int i = 0; i<3; i++) {
			System.out.println(lotteryCard[i][i]);
		}
		System.out.println("-------------");

		for(int i = 0; i<3; i++) {
			for(int j =0; j<3; j++) {
				System.out.println(lotteryCard[i][j]);
			}
		}
	}
}
