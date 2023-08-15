package com.kodnest.MethodsProgramming;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		long number=galacticAddition(num1, num2);
		System.out.println(number);
		scan.close();
	}
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}
	

}
