import java.util.Scanner;

public class Exercise2_6MultiplyTheDigitsInAnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tall, multipliserSiffer = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("- Programmet multipliserer alle siffer i tallet ditt -");
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
		
		multipliserSiffer = (tall % 10) * ((tall/10) % 10) * ((tall/10/10) % 10); // Bruker /10 og /10/10 for å splitte opp 'tall'
																				
		System.out.println("Ditt tall er: " + tall);
		System.out.println();
		System.out.println("Sifrene i tallet " + tall + " multiplisert gir " + multipliserSiffer +"" );
		
		input.close();
		
		
	}

}
