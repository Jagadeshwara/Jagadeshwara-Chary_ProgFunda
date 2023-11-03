package com.gradedproject.q2;

import java.util.Scanner;

public class FindingPowerValue {
	
	// Recursion method for calculating the power of number
	public static int power(int a, int n) {
		
		// Condition for terminating the process
		if(n==0) {
			return 1;
		}
		
		// Core logic for calculating the power of number
		int result = a*power(a, n-1);
		
		// Returning the output to the method
		return result;
	}

	// main method
	public static void main(String[] args) {
		// importing the Scanner class for taking inputs form the user
		Scanner sc = new Scanner(System.in);
		
		// Asking the user for input of base Number
		System.out.println("Enter the base number X : ");
		int baseNumber = sc.nextInt();
		
		// Asking the user for input of power
		System.out.println("Enter the power N : ");
		int power = sc.nextInt();
		
		// Printing the output by calling power method by passing the arguments
		System.out.println(power(baseNumber, power));
		
		// Closing the Scanner Class
		sc.close();
	}
}
