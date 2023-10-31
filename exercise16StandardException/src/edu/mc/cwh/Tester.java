package edu.mc.cwh;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Temperature temperature = new Temperature();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a bad scale or a bad temperature to test.");
		System.out.print("Scale: ");
		String scale = in.next();
		System.out.print("Temperature: ");
		double temp = in.nextDouble();
		
		//try {
			temperature.convertTemp(scale, temp);
			System.out.println();
			System.out.println("The equivalent temperatures are:");
			System.out.printf("Fahrenheit %.2f \n", 
                           temperature.getdegreesFahrenheit());
			System.out.printf("Celsius %.2f \n", 
                           temperature.getdegreesCelsius());
			System.out.printf("Kelvin %.2f \n", 
                           temperature.getdegreesKelvin());
			System.out.println();
		/*}
		catch (IllegalArgumentException e) {
			System.err.println("Invalid scale or temperature.");
			throw e;            
	    }
		finally */
			in.close();
		//}
	}
	
}
