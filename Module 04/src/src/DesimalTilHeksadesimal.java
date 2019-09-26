package src;

import java.util.Scanner;

public class DesimalTilHeksadesimal {

	public static void main(String[] args) {
		// 
		int decimal;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv inn et desimaltall mellom 0 og 15: ");
		decimal = input.nextInt();
		
		if (decimal > 15 || decimal < 0) {
			System.out.print("Du skrev inn et ugyldig tall, prøv på nytt!");
		}
		
		char hex;
			// 1. måte
		hex = Integer.toHexString(decimal).charAt(0);
		System.out.printf("%d i heksadesimal er %s\n", decimal, hex);
		
			// 2. måte
		String hexDigits = "0123456789ABCDEF";
		hex = hexDigits.charAt(decimal);
		System.out.printf("%d i heksadesimal er %s\n", decimal, hex);
		
			// 3. måte
		switch (decimal) {
			case 10: hex = 'A';
				break;
			case 11: hex = 'B';
				break;
			case 12: hex = 'C';
				break;
			case 13: hex = 'D';
				break;
			case 14: hex = 'E';
				break;
			case 15: hex = 'F';
				break;
			default:
				hex = (char) (decimal + 48);
		}
		System.out.printf("%d i heksadesimal er %s", decimal, hex);
		
		input.close();
	}

}
