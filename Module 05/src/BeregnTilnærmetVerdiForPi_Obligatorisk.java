
public class BeregnTilnærmetVerdiForPi_Obligatorisk {

	public static void main(String[] args) {
		// Beregn pi med 100,000 ledds nøyaktighet
		// pi er gitt ved	pi = 4 * (1 - (+ ((Math.pow((-1), i+1) / (2 * i - 1)))))
		
		double currentPiValue, sumPi = 0;
		System.out.println(" -- Programmet regner ut pi med en tilnærmet verdi ved opp til 100,000 ledds nøyaktighet -- \n");
		
		for (int i = 1 ; i <= 100000; i++) {
			currentPiValue = 4 * (Math.pow((-1), i+1)) / (2 * i - 1.0);
			sumPi += currentPiValue;
			
			// Printer ut nåværende verdi av Pi for hvert 10000 ledd med 15 desimaler
			if ((i % 10000) == 0 && i != 0)
				System.out.printf("For %s ledd i rekken er verdien av pi: %.15f \n", i, sumPi);
		}
	}
}