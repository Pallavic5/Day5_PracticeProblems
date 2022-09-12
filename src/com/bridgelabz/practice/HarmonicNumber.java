package com.bridgelabz.practice;

import java.util.Scanner;

public class HarmonicNumber {
	
	public static void main(String[] args) {
		
		double a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		a=sc.nextDouble();
		double h = harmonicCal(a);
		System.out.println("Nth Harmonic value = " +h);
		
	}
	static double harmonicCal(double n) 
	{
		double sum = 0;
		if(n != 0) {
			
			for(double i = 1; i <= n; i++)
			{
				sum= sum + (1/i);
			}
			
		}
		else {
			
			System.out.println("n is equal to zero.");
		}
		
		return sum;
}
}