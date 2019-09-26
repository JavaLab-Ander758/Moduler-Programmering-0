import java.util.Scanner;
import java.lang.Math;

public class PunktInniSirkel {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// Sjekke om oppgitt 2-desimalt punkt ligger innenfor sirkel med radius = 10
		
		double xCoordinate, yCoordinate, length;
		Scanner input = new Scanner(System.in);
		
		System.out.println("- Programmet sjekker om ditt punkt ligger inni en sirkel med radius lik 10 - \n------------------------------ \n");
		
		while(true) {
			//System.out.println();
			System.out.println("Oppgi x og y koordinater for et punkt\n");
			//System.out.println();
			System.out.print("Oppgi x-koordinat: ");
				xCoordinate = input.nextDouble();
			System.out.print("Oppgi y-koordinat: ");
				yCoordinate = input.nextDouble();
				
			length = Math.sqrt(Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2));
			
			if (length > 10) {
				System.out.println("-> Punktet er ikke inne i sirkelen\n______________________________ \n");
			} else if (length >= 0 || length <= 10) { 
				System.out.println("-> Punktet er inne i sirkelen\n______________________________ \n");
			}
		}

	}

}

// if(length >= 0 || length <= 10)