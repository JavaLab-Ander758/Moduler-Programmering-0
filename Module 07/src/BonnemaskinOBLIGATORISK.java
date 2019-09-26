import java.util.Scanner;

public class BonnemaskinOBLIGATORISK {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Oppgi antall baller: ");
			int antallBaller = input.nextInt();
		System.out.print("Oppgi antall spor: ");
			int[] sporArray = new int[input.nextInt()];
		input.close();
		
		// Simuler fall
		System.out.printf("\nR=høyre, L=venstre, havnet i [n]spor\n");
		for (int i = 0; i < antallBaller; i++) {
			sporArray[getPathForOneBall(sporArray.length)]++;
		}
		
		// Skriv ut resultat
		printResult(sporArray);
	}
	
	// Generer tilfeldig sti for fall av ball, printer sti og returner ballens indeks
	private static int getPathForOneBall(int spor) {
		int ballPosisjon = spor / 2;
		System.out.printf(" -> ");
		for (int i = 0; i < spor; i++) {
			if (Math.random() < 0.5) {
				// -->
				ballPosisjon++;
				System.out.print("R");
				if (ballPosisjon >= spor)
					ballPosisjon--;
			} else {
				// <--
				ballPosisjon--;
				System.out.print("L");
				if (ballPosisjon < 0)
					ballPosisjon++;
			}
		}
		System.out.printf(": [%d] \n", ballPosisjon);
		return ballPosisjon;
	}
	
	// Skriver ut søyler med sine baller til skjerm
	private static void printResult(int[] slots) {
		System.out.print("\n");
		int maxIndex = max(slots);
		
		// Generer maxIndex-dimensionell array for print
		int[][] matrice = new int[maxIndex][slots.length];
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				if (slots[j] >= maxIndex)
					matrice[i][j] = 1;
			}
			maxIndex--;
		}
		
		// Print matrice arrayen
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				if (matrice[i][j] == 1)
					System.out.print(" 0 ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		for (int i = 0; i < slots.length; i++)
			System.out.printf("|%d|", i);
	}
	
	// Returnerer indeks for søylen med flest baller
	private static int max(int[] slots) {
		int maxIndex = 0;
		for (int i = 0; i < slots.length; i++)
			if (slots[i] > maxIndex)
				maxIndex = slots[i];
		return maxIndex;
	}
}