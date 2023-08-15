package com.kodnest;

import java.util.Scanner;

public class BitwiseSwapper {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("Before swapping");
		System.out.println("First Integer is " + num1+" Second Integer is " + num2);
		swapUsingBitwise(num1,num2);
		scan.close();
	}
	public static void swapUsingBitwise(int num1,int num2) {
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("After swapping");
		System.out.println("First Integer is " + num1+" Second Integer is " + num2);
	}
}
