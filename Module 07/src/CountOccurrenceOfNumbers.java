import java.util.Scanner;

public class CountOccurrenceOfNumbers {

	public static void main(String[] args) {
		// Count occurrences of given inputs from user ranging from 1-100
		
		Scanner input = new Scanner(System.in);
		int[] counts = new int[100];
		
		System.out.print("Enter the integers between 1 and 100: ");
		
		// Read all numbers
		int number = input.nextInt(); // Number read from a file
		while (number != 0) {
			if (number <= 100 && number >= 1)
				counts[number - 1]++;
			number = input.nextInt();
		}
		
		// Display result
		for (int i = 0; i < 100; i++) {
			if (counts[i] > 0)
				System.out.println((i + 1) + " occurs " + counts[i]+ ((counts[i] == 1) ? " time" : " times"));
		}
		
		input.close();
	}
}