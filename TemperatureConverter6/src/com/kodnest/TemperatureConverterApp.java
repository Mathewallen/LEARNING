package com.kodnest;

import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the fahrenheit");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		System.out.println(temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
		scan.close();
	}
	public double convertFahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit-32)*5/9;
	}


}
