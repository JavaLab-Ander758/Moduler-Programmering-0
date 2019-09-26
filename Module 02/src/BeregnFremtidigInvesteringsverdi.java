import java.util.Scanner;
import java.awt.Color;
import java.lang.Math;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BeregnFremtidigInvesteringsverdi {

	public static void main(String[] args) {
		// FremtidigInnvesteringsverdi = investeringsverdi * (1 + maanedligRente)^(antallAar*12)
		
		double investmentValue;
		double yearCount;
		double monthlyRent;
		double futureInvestmentValue;
		Scanner input = new Scanner(System.in);
		//NumberFormat formatter = new DecimalFormat("#0.00");
		
		System.out.println("- Dette programmet kalkulerer din fremtidige investeringsverdi -");
		System.out.println("");
		System.out.print("Oppgi investeringsverdi: ");
		investmentValue = input.nextDouble();
		System.out.print("Oppgi antall år: ");
		yearCount = input.nextDouble();
		System.out.print("Oppgi årlig rente: ");
		monthlyRent = input.nextDouble() / 1200.0;
		System.out.println("");
		
		futureInvestmentValue = investmentValue * Math.pow(1 + monthlyRent, yearCount*12);
		System.out.printf("Fremtidig Investeringsverdi er: %.2f etter %.0f år",futureInvestmentValue, yearCount);
		
	}

}