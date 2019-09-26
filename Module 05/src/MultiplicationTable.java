import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Ask user for how how many digits he/she wants in the output
		System.out.print("Hvor langt vil du telle gangetabellen til?: ");
		int countTo = input.nextInt(); 
		
		// Display the table heading
		System.out.println("\n	Multiplication table\n");
		
		// Display the number title
		System.out.print("    ");
		for (int j = 1; j <= countTo; j++) {
			System.out.print("   " + j);
		}
				
		// Display proper length for syntax grid
		System.out.print("\n----");
		for (int k = 1; k <= countTo; k++) {
			System.out.print("----");
			if (k == countTo)
				System.out.println();
		}

		// Print table body
		for (int i = 1; i <= countTo; i++ ) {
			System.out.print(i + " | ");
			for (int j = 1; j <= countTo; j++) {
				// Display the product and align properly
				System.out.printf("%4d", i * j); // radnummer = i*j = radnummer * kolonnenummer
			} // end inner for loop
			System.out.println();
		} // end outer for loop
		
		input.close();
	}
}
