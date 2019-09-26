public class BeregnFremtidigÅrsavgift {

	public static void main(String[] args) {
		// Beregn årsavgiften etetr ti år og så summen for fire år 
		
		final double ANNUAL_INCREASE = 1.05;
		double annualFee = 10000, annualFeeSum = 0;
		
		for (int i = 1; i < 14+1; i++) {
			// Annnual fee increases by 0.05% annualy
			annualFee *=ANNUAL_INCREASE;

			// Output annualFee if i counted to 10 for ten years
			if (i == 10) {
				System.out.printf("Årsavgiften etter ti år er: %.2f kr \n", annualFee);
				annualFeeSum = 0;
				
				// if counted to 11 or 14, summarize annualFee with annualFeeSum for every loop 
			} else if (i >= 11 || i <= 14) {
				annualFeeSum += annualFee;
				
				// if counted to 14 years, output annualFeeSum
				if (i == 14)
					System.out.printf("Årsavgiften for år 11-14 er: %.2f kr", annualFeeSum);
			}
				
		}	
	}
}

//73717,76