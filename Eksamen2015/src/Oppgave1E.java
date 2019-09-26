import java.util.Scanner;

public class Oppgave1E {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Gi inn antall transaksjoner: ");
		int antallTransaksjoner = input.nextInt();
		
		System.out.printf("Pris for %s transaksjoner er kr %.1f \n", antallTransaksjoner, beregnAvgift(antallTransaksjoner));
		
		
	}
	
	static double beregnAvgift(int antallTransaksjoner) {
		double result = 20;
		
		for (int i = 1; i <= antallTransaksjoner; i++) {
			if (i <= 19)
				result += 2;
			else if (i >= 20 && i <= 39)
				result += 1;
			else if (i >= 40 && i <= 59)
				result += 0.5;
			else if (i >= 60)
				result += 0.25;
		}
		return result;
	}


	
}
