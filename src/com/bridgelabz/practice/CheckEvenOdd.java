package com.bridgelabz.practice;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		int num = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = reader.nextInt();
		
		CheckEvenOdd evenodd = new CheckEvenOdd();
		evenodd.checkEvenodd(num);

	}
	
	public int checkEvenodd(int n) {
		
		if(n % 2 == 0) {
			
			System.out.println("You have entered even number");
		}
		
		else {
			
			System.out.println("You have entered odd number");
		}
		
		return(n);
	}

}
