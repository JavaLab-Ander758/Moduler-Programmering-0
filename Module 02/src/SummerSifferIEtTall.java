import java.util.Scanner;

public class SummerSifferIEtTall {

	public static void main(String[] args) {

		int tall;
		int summerSiffer = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("- Programmet summerer alle siffer i tallet ditt -");
		System.out.println();

		while (true) {
			System.out.print("Oppgi et tall mellom 0 og 999: ");
			tall = input.nextInt();

			if (tall >= 0 && tall <= 999) {
				break;
			} else /* if (tall <= 0 || tall >= 999) */ {
				System.out.println("Du oppga et ugyldig tall, prøv på nytt!");
				System.out.println();
			}
		}
		
		summerSiffer = tall % 10 + (tall/10) % 10 + (tall/10/10) % 10; // Bruker /10 og /10/10 for å splitte opp 'tall'
																				
		System.out.println("Ditt tall er: " + tall);
		System.out.println();
		System.out.println("Summen av " + tall + " er lik " + summerSiffer);
		
		input.close();
	}

}