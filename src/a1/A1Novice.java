package a1;

import java.util.Scanner;

public class A1Novice {
	
	
	// Main takes in the information using the scanner by storing them in variables within arrays 
	// and then calculates a total and then prints the necessary info from those variables.
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numCustomers = scan.nextInt();
		
		
		String[] firstNames = new String[numCustomers];
		String[] lastNames =  new String[numCustomers];
		int[] numItems = new int[numCustomers];
		double[] totalMoney = new double[numCustomers];
		
		for (int i = 0; i < numCustomers; i++) {
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
			numItems[i] = scan.nextInt();
			
			for (int j = 0; j < numItems[i]; j++) {
				int numItemType = scan.nextInt();
				String itemType = scan.next();
				double itemPrice = scan.nextDouble();
				totalMoney[i] += numItemType * itemPrice;
			}
		}
		
		for (int i = 0; i < numCustomers; i++) {
			System.out.println(firstNames[i].charAt(0) + ". " + lastNames[i] + ": " + totalMoney[i]);
		}
		
		
	}
}
