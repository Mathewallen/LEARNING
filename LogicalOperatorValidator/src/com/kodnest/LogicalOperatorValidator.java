package com.kodnest;

import java.util.Scanner;

public class LogicalOperatorValidator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value");
		boolean validInput=scan.nextBoolean();
		System.out.println("Enter a Condition");
		boolean condition=scan.nextBoolean();
		boolean c=isValidInput(validInput,condition);
		System.out.println(c);
		if(true==c){ 
			System.out.println("Input is Valid");
		}
		else {
			System.out.println("Input is Not Valid");
		}
		scan.close();
	}
	public static boolean isValidInput(boolean validInput, boolean condition) {
	    boolean a=validInput&&condition;
		return a;
	}
	

}
