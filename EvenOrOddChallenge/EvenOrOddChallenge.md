package com.EvenOrOdd;

import java.util.Scanner;

public class EvenOrOddChallenge {
		
	
	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		Scan.close();
		
		System.out.print("What is your Number: ");
		Long num = Scan.nextLong();
		
		if(num % 2 == 0)
			System.out.println("Even");
		
		else 
			System.out.println("Odd");
	}

}
