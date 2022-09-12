package com.bridgelabz.practice;

import java.util.Scanner;

public class SwappingTwoNum {

	public static void main(String[] args) {
		
		int x, y, temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of X & Y: ");
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("Before swapping number is: " + x + " " + y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("After swapping number is: " + x + " " +y);
	}

}
