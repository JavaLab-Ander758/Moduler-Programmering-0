import java.util.Scanner;

public class BubbleSortArray {

	public static void main(String[] args) {
		// Bubble sort ascending in an array with n random numbers from given min to max
		
		/**
		 * All Rights reserved AndyEse Apps
		 * 25.10.2018
		 **/
		final int DISPLAY_LENGTH = 50;

		/** Gather resources **/
		Scanner input = new Scanner(System.in);
		System.out.print("Hvor lang vil du ha arrayen myList?: ");
			int arrayLength = input.nextInt();
		System.out.print("\nHva vil du ha de tilfeldige tallene i arrayen myList mellom?");
		System.out.print("\n--> min: ");
			int min = input.nextInt() - 1;
		System.out.print("--> max: ");
			int max = input.nextInt();
		input.close();

		//** Calculate time interval start to stop **/
		int startTime = (int) System.currentTimeMillis();
		
		
		int[] myList = new int[arrayLength];
		// Fill with random integers from 0-9
		System.out.printf("\nDe %d tilfeldige tallene i arrayen myList er som følger: \n", arrayLength);
		for (int i = 0; i < myList.length; i++) {
			myList[i] = (int)(Math.random() * (max - min) + 1) + min;
			
			// Output myList
			System.out.print(myList[i] + " ");
			if ((i+1) % DISPLAY_LENGTH == 0)
				System.out.print("\n");
		}
		
		/** Sort myList ascending **/
		for (int i = 0; i < myList.length; i++) {
			for (int j = 0; j < myList.length; j++) {
				if (myList[i] < myList[j]) {
					int temp = myList[i];
					myList[i] = myList[j];
					myList[j] = temp;
				}
			}
		}
		
		// Output sorted myList
		System.out.print("\n\nmyList sortert blir: \n");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
			if ((i+1) % DISPLAY_LENGTH == 0)
				System.out.print("\n");
		}
		
		// Output elapsed time from execute myList generating
		int endTime = (int) System.currentTimeMillis();
		System.out.printf("\n\nElapsed time was: \n -> %d seconds... \n -> or: %d milliseconds", (endTime - startTime) / 1000, (endTime - startTime));
	}
}