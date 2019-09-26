import java.util.Scanner;

public class KalkulatorOBLIGATORISK {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ikke bruk forskjellige regneuttrykk i samme regnestykke \n");
		System.out.print("Oppgi regnestykket, tall fra 1 -> 9: ");
		String text = input.nextLine();
		System.out.printf("Resultat: %s \n", calculateExpression(text));
		input.close();
	}
	
	public static double calculateExpression(String text) {
		double result = 0;
		
		// Trim the string
		String trimmedText = text.replaceAll("[\\s *+-/]", "");
		
		// String to integer
		int number = Integer.parseInt(trimmedText);
		
		// Generate integer array
		int[] intArray = new int[trimmedText.length()];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = number % 10;
			number /= 10;
		}
		
		// Reverse array
		for(int i = 0; i < intArray.length / 2; i++) {
			int temp = intArray[i];
			intArray[i] = intArray[intArray.length - i - 1];
			intArray[intArray.length - i - 1] = temp;
		}
		
		// Return calculation
		if (text.contains("+") == true)
			result = intArray[0] + intArray[1];
		else if (text.contains("-") == true)
			result = intArray[0] - intArray[1];
		else if (text.contains("*") == true)
			result = intArray[0] * intArray[1];
		else if (text.contains("/") == true)
			result = (double)intArray[0] / intArray[1];
				
		return result;
	}
}