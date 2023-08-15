package com.kodnest;

import java.util.Scanner;

public class MethodOverloadingCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Operators");
		char num3=scan.next().charAt(0);
		System.out.println("Enter the two number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		switch(num3) {
		case '+':
			calculate(num1,num2);
			break;
		case '-':
			calculate("operator",num1,num2);
			break;
		case '*':
			calculate(num1,num2,"operator");
			break;
		case '/':
			calculate(num1,"operator");	
			break;
		}
		scan.close();
	}
	public static void calculate(int num1, int num2) {
		switch('+') {
		case '+':
			int c=num1+num2;
			System.out.println("addition is "+c);
			break;
		}
	}
	public static void calculate(String type,int a, int b) {
		switch('-') {
		case '-':
			int c=a-b;
			System.out.println("substraction is "+c);
			break;
		}
		}
	public static void calculate(int c, int d,String type) {
		switch('*') {
		case '*':
			int a=c*d;
			System.out.println("multiplication is "+a);
			break;
		}
		}
	public static void calculate(int e,String type) {
		switch('/') {
		case '/':
			int f=5;
			int a=e/f;
			System.out.println("division is "+a);
			break;
		}
		
	}
}
	
		



