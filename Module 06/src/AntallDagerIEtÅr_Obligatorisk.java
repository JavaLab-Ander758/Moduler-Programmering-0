public class AntallDagerIEt≈r_Obligatorisk {

	public static void main(String[] args) {
	// Print ut antall dager i Âr 2000-2020
		
		// Printer ut 20 outputs
		for (int i = 2000, days; i <= 2020; i++) {
			days = numberOfDaysInAYear(i);
			System.out.printf("≈r %s har %s dager. \n", i, days);
		}
	}
	
	// Kalkulerer antall dager i et gitt Âr
	public static int numberOfDaysInAYear(int year) {
		int days;
		if((year % 400 == 0) || ((year % 4 == 0) && (year) % 100 != 0))
			days = 366;
		else
			days = 365;
		return days;
	}
}