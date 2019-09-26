import java.util.Scanner;
//import java.text.DecimalFormat;
//import java.text.NumberFormat;

public class Sekundkonvertering {

	public static void main(String[] args) {
		// Konverter sekunder til timer, minutter og sekunder
		
		double sekunder0, timer1, minutter1, sekunder1;
		//double timer_1;
		//double minutter_1;
		//double sekunder_1;
		Scanner inputTime = new Scanner(System.in);
		//NumberFormat formatter = new DecimalFormat("#0.0");
		
		System.out.println("- Programmet konverterer dine sekunder til timer, minutter og sekunder -");
		System.out.println("");
		System.out.print("Oppgi antall sekunder: ");
		sekunder0 = inputTime.nextDouble();
		
		timer1 = sekunder0 / 3600.0;
		minutter1 = (sekunder0 % 3600.0) / 60;
		sekunder1 = sekunder0 % 60.0;
		
		System.out.println("");
		// System.out.println(sekunder0 + " sekunder er " + formatter.format(timer1) + " time(r) og " + formatter.format(minutter1) + " minutt(er) og " + formatter.format(sekunder1) + " sekund(er)");
		System.out.printf(sekunder0+" sekunder er %.1f time(r) og %.1f minutt(er) og %.1f sekund(er)", timer1, minutter1, sekunder1);
		
		inputTime.close();
	}

}