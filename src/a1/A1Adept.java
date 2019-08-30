package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numItems = scan.nextInt();
		
		String[] itemType = new String[numItems];
		double[] itemPrice = new double[numItems];
				
		for (int i = 0; i < numItems; i++) {
			itemType[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}
		
		int numCustomer = scan.nextInt();
		
		String[] firstName = new String[numCustomer];
		String[] lastName = new String[numCustomer];
		double[] customerTotal = new double[numCustomer];

		
		for (int i = 0; i < numCustomer; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			int numTypeItems = scan.nextInt();
			for (int j = 0; j < numTypeItems; j++ ) {
				customerTotal[i] += scan.nextInt() *  getPrice(scan.next(), itemType, itemPrice);
			}
		}
		
		
		System.out.println("Biggest: " + firstName[biggestCustomer(customerTotal)] + " "
		+ lastName[biggestCustomer(customerTotal)] + "(" + customerTotal[biggestCustomer(customerTotal)] + ")");
		
		System.out.println("Lowest: " + firstName[lowestCustomer(customerTotal)] + " "
				+ lastName[lowestCustomer(customerTotal)] + "(" + customerTotal[lowestCustomer(customerTotal)] + ")");
		
		System.out.println("Average: " + average(customerTotal));
		
	}
	
	public static double getPrice (String itemName, String[] itemTypes, double[] itemPrices) {
		double price = 0.0;
		for (int i = 0; i < itemTypes.length; i++) {
			if (itemName.equals(itemTypes[i])){
				price = itemPrices[i];
			}
		}
		return price;
	}
	
	public static int biggestCustomer (double[] customerTotal) {
		int highest = 0;
		for (int i = 0; i < customerTotal.length; i++) {
			if (customerTotal[i] > customerTotal[highest]) {
				highest = i;
			}
		}
		return highest;
	}
	
	public static int lowestCustomer (double[] customerTotal) {
		int lowest = 0;
		for (int i = 0; i < customerTotal.length; i++) {
			if (customerTotal[i] < customerTotal[lowest]) {
				lowest = i;
			}
		}
		return lowest;
	}
	
	public static double average (double[] customerTotal) {
		double average = 0.0;
		for ( int i = 0; i < customerTotal.length; i++) {
			average += customerTotal[i];
		}
		average /= customerTotal.length;
		average *= 100;
		average = Math.floor(average);
		average /= 100;
		return average;
	}
}
