package com.kodnest.methods;

import java.util.Scanner;

public class CalculatorDilemma {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number between 1-4");
		int num=scan.nextInt();
		System.out.println("Enter a number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		switch(num) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		default:
			System.out.println("Idoit go test your eyes");
		}
		scan.close();
	}

}
