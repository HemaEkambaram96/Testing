package org.ph;

import java.util.Scanner;

public class Company1 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		if (num%2==0)
		{
			System.out.println("num is even");
		}
		else {
		System.out.println("odd");	
		}
	}
}
