import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FremskrivingAvBefolkning {

	public static void main(String[] args) {

		//Born 7 pr. sec, dead 13 pr. sec., imigrating 45 pr. sec. Pupulation_0 = 312032486
		
		int population_0 = 312032486;
		int secYear = 60*60*24*365;
			System.out.println("1 year = " + secYear + " seconds");
		double totalGrowthPerYear = (secYear/7.0)-(secYear/13)+(secYear/45);
			System.out.println("Total growth per year = " + totalGrowthPerYear);
		double population_5 = population_0 + totalGrowthPerYear*5;
		
		NumberFormat formatter = new DecimalFormat("#0.");
		
		System.out.println("");
		System.out.println("In 5 years, the total population in USA is " + formatter.format(population_5));
	}

}