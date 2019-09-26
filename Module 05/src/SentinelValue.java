import java.util.Scanner;
public class SentinelValue {

	public static void main(String[] args) {
		
		int data;
		
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Read an initial data
		System.out.print("Enter an int value (The program exits if the value is 0): ");
		data = input.nextInt();
		
		// Keep reading data until the input is 0
		int sum = 0;
			// Løkka breaker dersom brukeren gir 0 i input
		while (data != 0) {
			sum += data;
			
			// Read the next data
			System.out.print("Enter an int value (The program exits if the value is 0): ");
			data = input.nextInt();
		}
		
		System.out.printf("\n--------------------\n--> The sum of the values you entered is %d", sum);
		
		input.close();
	}

}
