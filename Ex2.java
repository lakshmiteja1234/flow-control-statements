package com.wipro.flowcontrolstatements;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		
		if (x % 2 == 0) System.out.println("Even");
		else System.out.println("Odd");
		
		main(args);
		sc.close();
	}

	

}
