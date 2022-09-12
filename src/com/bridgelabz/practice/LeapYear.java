package com.bridgelabz.practice;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		
		int year = sc.nextInt();
		
		LeapYear leapyear = new LeapYear();
		System.out.println(leapyear.isLeapYear(year) ? "It is a Leap Year" : "It is not a Leap Year");
	}
	
	public boolean isLeapYear(int year) {
		
		return(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}
	
	

}
