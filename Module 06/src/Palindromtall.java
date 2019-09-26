import java.util.Scanner;

public class Palindromtall {

	public static void main(String[] args) {
		// Sjekk om gitt int er er et palindromTall -> 12321 === 12321
		
		int original, reversed;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Skriv inn en integer, så sjekker vi om det er et palindromtall ;-): ");
			original = input.nextInt();
			input.close();
		
		// Kaller method 'reverseOriginal' med verdien 'original'
		reversed = reverseOriginal(original);
		
		// Sjekker om tallene er like, dersom de er like er det et palindromtall
		if (original == reversed)
			System.out.printf("\n-> OMG! tallet ditt, %d, er et palindromtall", original);
		else
			System.out.printf("\n-> Uffda! Tallet ditt, %d, er ikke et palindromtall", original);
	}
	
	// Oppretter method for å bygge opp en reversert int fra en gitt int
	public static int reverseOriginal(int number) {
		// Oppretter en ny int som skal bygges reversert 'original'
		int reversedNumber = 0;
		// Kjører loopen så lenge number(original) > 0
		while (number > 0) {
			// Henter siste verdi hos den originale integeren
			int lastDigit = number % 10;
			
			reversedNumber = reversedNumber * 10 + lastDigit;
			number /= 10;
		}
		return reversedNumber;
	}
}