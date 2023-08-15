package com.kodnest;

import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount");
		double amount=scan.nextDouble();
		System.out.println("Enter the tax rate (in decimal form)");
		double rate=scan.nextDouble();
		System.out.println(calculateTotalWithTax(amount,rate)+amount);
		scan.close();
	}
	public static double calculateTotalWithTax(double amount, double rate) {
		return  amount *rate;
	}

}
