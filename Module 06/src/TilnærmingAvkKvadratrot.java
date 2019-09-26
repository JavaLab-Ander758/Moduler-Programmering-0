import java.util.Scanner;

public class TilnærmingAvkKvadratrot {

	public static void main(String[] args) {
		// Bruk babylonsk metode for å tilnærme kvadratoren av et gitt heltall
		long startTime = System.currentTimeMillis();
		
		double initialGuess, wantedRootOf;
		Scanner input = new Scanner(System.in);
		System.out.println("- Dette programmet finner tilnærmet verdi for kvadratroten av et tall - ");	
		
		System.out.print("\nSkriv in et positivt tall du ønsker å kalkulere roten av: ");
			wantedRootOf = input.nextDouble();
			input.close();
		initialGuess = wantedRootOf / 2;
		
		double approximateRoot = calculateRoot(wantedRootOf, initialGuess);
		System.out.printf("\nTilnærmet verdi for kvadratroten av %.2f er: %.5f", wantedRootOf, approximateRoot);
		
		long endTime = System.currentTimeMillis();
		System.out.printf("\nKalkulasjonen tok %d millisekunder", (endTime - startTime)  / 1000);
	}
	
	
	public static double calculateRoot(double n, double seed) {
		double nextGuess = seed, lastGuess = 0;
		int count = 1;
		while (Math.abs(nextGuess - lastGuess) >= 0.00001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
			System.out.printf("\n -> %s.ste gjetning = %s", count, nextGuess);
			count++;
		}
		System.out.printf("\nItterasjoner: %s", count-1);
		return lastGuess;
	}
	
}