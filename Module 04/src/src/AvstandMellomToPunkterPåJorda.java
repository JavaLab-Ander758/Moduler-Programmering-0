package src;

import java.util.Scanner;

public class AvstandMellomToPunkterPåJorda {

	public static void main(String[] args) {
		// Avstand mellom to punkt på jorda ->	radius * arccos(sin(x_1) * sin(x_2) + cos(x_1) * cos(x_2) * cos(y_1 - y_2))    (Husk at arccos er cosinus invers!!!, Math.acos i java)
		// Jordas radius = 6371.01 km
		
		double breddeGrad1, breddeGrad2, lengdeGrad1, lengdeGrad2, avstandMellomToPunkt;
		final double JORD_RADIUS = 6371.01;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("- Programmet regner ut avstanden mellom to punkter på jorda! - \n------------------------------\n");
		System.out.println("Skriv inn bredde- og lengdegrader for dine to punkter\n");
		
		System.out.println("-> Punkt 1");
		System.out.print("	-Breddegrad: ");
			breddeGrad1 = Math.toRadians(input.nextDouble());
		System.out.print("	-Lengdegrad: ");
			lengdeGrad1 = Math.toRadians(input.nextDouble());
		System.out.println("-> Punkt 2");
		System.out.print("	-Breddegrad: ");
			breddeGrad2 = Math.toRadians(input.nextDouble());
		System.out.print("	-Lengdegrad: ");
			lengdeGrad2 = Math.toRadians(input.nextDouble());
		
		avstandMellomToPunkt = JORD_RADIUS * Math.acos(Math.sin(breddeGrad1) * Math.sin(breddeGrad2) 
				+ Math.cos(breddeGrad1) * Math.cos(breddeGrad2) * Math.cos(lengdeGrad1 - lengdeGrad2));
		
		System.out.printf("====> Avstanden mellom de to punktene er %.2f km", avstandMellomToPunkt);
		input.close();
	}
}
