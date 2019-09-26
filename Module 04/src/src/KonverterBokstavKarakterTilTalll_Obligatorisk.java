package src;

import java.util.Scanner;

public class KonverterBokstavKarakterTilTalll_Obligatorisk {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// 
		String inputText;
		char bokstavKarakter;
		int ASCII, bokstavVerdi=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Oppgi en bokstav karakter fra A til F: ");
		inputText = input.nextLine();
		inputText = inputText.toUpperCase();
		bokstavKarakter = inputText.charAt(0);
		
		ASCII = (int)bokstavKarakter; // A=65 og F=70
		System.out.printf("Din ASCII verdi er: %s\n", ASCII);
		
		if (ASCII < 65 || ASCII > 70) {
			System.out.printf("\n%s er en ugyldig karakter.", inputText);
		} else if (ASCII >= 65 || ASCII <= 70) {
			switch (ASCII) {
				case 65: bokstavVerdi = 6; break;
				case 66: bokstavVerdi = 5; break;
				case 67: bokstavVerdi = 4; break;
				case 68: bokstavVerdi = 3; break;
				case 69: bokstavVerdi = 2; break;
				case 70: bokstavVerdi = 1; break;
			}
		System.out.printf("\n\nNumerisk verdi for: %s er: %s", bokstavKarakter, bokstavVerdi);
		}
	}

}