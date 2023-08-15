package com.kodnest;

import java.util.Scanner;

public class JourneyCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of speed and time");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator journeyCalculator=new JourneyCalculator();
		System.out.println(journeyCalculator.calculateDistance(speed,time));	
	}
	public double calculateDistance(double speed, double time) {
		return speed*time;
	}
}
