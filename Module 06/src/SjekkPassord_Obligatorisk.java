import java.util.Scanner;

public class SjekkPassord_Obligatorisk {

	public static void main(String[] args) {
		// Sjekk om et passord er lovlig
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Skriv inn ditt hemmelige passord: ");
			String inputPassord = input.nextLine();
			input.close();
		
		if (checkLength(inputPassord) == 1 && checkLettersNumber(inputPassord) == 1 && checkMinimumStandards(inputPassord) == 1)
			System.out.println("Legal");
		else
			System.out.println("Illegal");
	}
	
	// Minimum 8 lang
	public static int checkLength(String passord) {
		int legal;
		if (passord.length() >= 8)
			legal = 1;
		else
			legal = 0;
		
		return legal;
	}
	// Kun bokstaver og siffer
	public static int checkLettersNumber(String passord) {
		int legal = 0;
		char bokstavKarakter;
		for (int i = 0, ASCII; i < passord.length(); i++) {
			bokstavKarakter = passord.charAt(i);
			ASCII = (int)bokstavKarakter;
			
			if ((ASCII >= 48 && ASCII <= 57) || (ASCII >= 65 && ASCII <= 90) || (ASCII >= 97 && ASCII <= 122))
				legal = 1;
			else {
				legal = 0;
				break;
			}
		}
		return legal;
	}
	// Minst 2 siffer
	public static int checkMinimumStandards(String passord) {

		int legal = 0, nCounter = 0;
		char n;
		for (int i = 0, ASCII; i < passord.length(); i++) {
			n = passord.charAt(i);
			ASCII = (int)n;
			if (ASCII >= 49 && ASCII <= 59)
				nCounter++;
		}
		if (nCounter >= 2)
			legal = 1;
		
		return legal;
	}
}
