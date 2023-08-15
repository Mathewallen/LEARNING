package com.kodnest.methodProgramming;

import java.util.Scanner;

public class Double {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
       int number = doubleTheNumber(num);
       System.out.println(number);
		scan.close();
		
	}
	public static int doubleTheNumber(int num) {
		return num*2;
	}
}
