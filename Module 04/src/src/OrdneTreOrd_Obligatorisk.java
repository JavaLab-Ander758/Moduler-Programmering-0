package src;

import java.util.Scanner;

public class OrdneTreOrd_Obligatorisk {

	public static void main(String[] args) {
		//	
		String wordOne, wordTwo, wordThree, cacheString;
		Scanner input = new Scanner(System.in);

		System.out.println(" - Programmet sorterer tre ord etter alfabetisk rekkefølge \n\n");		
		System.out.print("Ord 1: ");
			wordOne = input.nextLine();
		System.out.print("Ord 2: ");
			wordTwo = input.nextLine();
		System.out.print("Ord 3: ");
			wordThree = input.nextLine();		
		input.close();
		
		if (wordOne.compareTo(wordTwo) > 0) {
			cacheString = wordOne;
			wordOne = wordTwo;
			wordTwo = cacheString;
		}
		if (wordOne.compareTo(wordThree) > 0) {
			cacheString = wordOne;
			wordOne = wordThree;
			wordThree = cacheString;
		}
		if (wordTwo.compareTo(wordThree) > 0) {
			cacheString = wordTwo;
			wordTwo = wordThree;
			wordThree = cacheString;
		}
		
		System.out.printf("Ordene dine sortert blir %s, %s og %s", wordOne, wordTwo, wordThree);
	}
}