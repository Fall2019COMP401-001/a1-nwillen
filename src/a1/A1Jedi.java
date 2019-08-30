package a1;

import java.util.Scanner;

public class A1Jedi {

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
		int[] numEachItem = new int[numItems];
		int[] customerEachItem = new int[numItems];

		
		for (int i = 0; i < numCustomer; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			int numTypeItems = scan.nextInt();
			for (int j = 0; j < numTypeItems; j++ ) {
				int customerNumEachItem = scan.nextInt();
				String customerItemType = scan.next();
				for (int k = 0; k < itemType.length; k++) {
					if (customerItemType.equals(itemType[k])) {
						numEachItem[k] += customerNumEachItem;
						customerEachItem[k]++;
					}
				} 
			}
		}
		
		for (int i = 0; i < itemType.length; i++) {
			if (numEachItem[i] == 0) {
				System.out.println("No customers bought " + itemType[i]);
			} else {
				System.out.println(customerEachItem[i] + " customers bought " + numEachItem[i] + " " + itemType[i]);
			}
		}
		
	}	
}
