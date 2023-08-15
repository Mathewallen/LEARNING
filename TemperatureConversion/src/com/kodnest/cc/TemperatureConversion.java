package com.kodnest.cc;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:");
		int num=scan.nextInt();
		System.out.println("Enter Temperature");
		double num1=scan.nextDouble();
		switch(num) {
		case 1:
			System.out.println(num1 + " C is equivalent to " + celsiusToFahrenheit(num1)+"F");
			break;
		case 2:
			System.out.println(num1 + " C is equivalent to " + fahrenheitToCelsius(num1)+"C");	
			break;
		}
		scan.close();
	}
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit ) {
		return (fahrenheit - 32) * 5/9;
	}

}
