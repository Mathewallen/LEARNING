package com.kodnest;

import java.util.Scanner;

public class BitwiseBitCounter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num1=scan.nextInt();
		System.out.println(countSetBits(num1));
		scan.close();
	}
	public static int countSetBits(int num1) {
		int integer=num1;
		System.out.println("Binary code is " + Integer.toBinaryString(integer));
		return Integer.bitCount(integer);
	}

}
