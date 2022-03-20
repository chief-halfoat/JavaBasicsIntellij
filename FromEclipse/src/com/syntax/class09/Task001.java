package com.syntax.class09;

public class Task001 {

	public static void main(String[] args) {
		// Create an array to store 4 different prices
		// find an average of those prices

		double[] prices = new double[4];

		prices[0] = 2.99;
		prices[1] = 3.99;
		prices[2] = 9.99;
		prices[3] = 12.99;

		double avg = (prices[0] + prices[1] + prices[2] + prices[3]) / 4;

		double avg1 = 0;

		for (int i = 0; i < 4; i++) {
			avg1 = avg1 + prices[i];
		}

		avg1 = avg1 / 4;

		System.out.println(avg);
		System.out.println(avg1);
	}

}
