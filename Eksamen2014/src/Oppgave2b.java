import java.util.Scanner;
import java.util.Random;

public class Oppgave2b {

	public static void main(String[] args) {
		
		int[][] salgsTabell = new int[5][1]; // solgte/produkt
		int[] prisTabell = new int[4];
		Random rand = new Random();
		for (int i = 0; i < prisTabell.length; i++)
			prisTabell[i] = rand.nextInt((5000 - 200) + 1) + 200;
		
		Scanner input = new Scanner(System.in);
		int continueCheck = 0;
		System.out.println("Skriv inn selger lik -1 for å stanse programmet");
		while (continueCheck != -1) {
			System.out.print(" -> Selger: ");
			int selger = input.nextInt() - 1;
			System.out.print(" -> Produkt: ");
			int produkt = input.nextInt() - 1;
			System.out.print(" -> Antall solgt: ");
			int antallSolgt = input.nextInt();
			
			salgsTabell[selger][0] += prisTabell[produkt] * antallSolgt;
			
			System.out.print("Skriv inn et annet tall enn -1 for å fortsette: ");
			continueCheck = input.nextInt();
		}
		
		for (int i = 0; i < salgsTabell.length; i++)
			for (int j = 0; j < salgsTabell[i].length; j++)
				System.out.printf("Selger nr : %s kr %s \n", i + 1, salgsTabell[i][j]);
	}
}
