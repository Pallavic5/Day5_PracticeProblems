package com.bridgelabz.practice;

public class PowerOfTwo {
	
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]); //read in one command line argument
		
		int powerOfTwo = 1;
		//int i=0;

		// CONDITION CHECK
		if (num > 31) {
			System.out.println("value of number should be less than 31");
			return;
		}

		// COMPUTATION
		else {
			
			//System.out.println(powerOfTwo);
			for (int j = 1; j <= num; j++) {
				powerOfTwo = powerOfTwo * 2;
				System.out.println(powerOfTwo);
			}
			
//			while (i <= num) {
//	            System.out.println(i + " " + powerOfTwo);   // print out the power of two
//	            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
//	            i = i + 1;
//				
//			}
		}
	}

}
