package com.bridgelabz.practice;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		int num1, num2, num3, temp, largest;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter a second number");
		num2 = sc.nextInt();
		
		System.out.println("Enter a third number");
		num3 = sc.nextInt();
		
		temp = num1 > num2 ? num1 : num2;
		
		largest = num3 > temp ? num3 : temp;
		
		System.out.println("The Largest Number is: "+largest);
		
	}

}
