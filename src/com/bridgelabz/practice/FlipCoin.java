package com.bridgelabz.practice;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		
		int n, headCount = 0, tailCount = 0;
		double heads, tails;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of times you want to flip the coin: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			double random = Math.random();
			System.out.println(random);
			
			if(random < 0.5) {
				
				tailCount ++;
			}
			else {
					headCount ++;
			}
			
			heads = headCount / (double) n * 100;
			tails = tailCount / (double) n * 100;		//denominator calculation  0.02*100=200
			System.out.println("Percentage of heads: " + heads + "%");
			System.out.println("Percentage of tails: " + tails + "%");
		}
	}

}
