import java.util.Scanner;
public class SnuTekst_Obligatorisk {

	public static void main(String[] args) {
		// Reverser en input for brukeren
		
		String inputText, output = "";
		char cacheText;
		
		Scanner input = new Scanner(System.in);

		// Henter inn stringen som skal reverseres og genererer en int for stringens lengde
		System.out.print("Skriv teksten du �nsker � snu: ");
			inputText = input.nextLine();
		int inputTextLength = inputText.length();
		
		// Kj�rer for-loopen s� lenge i er mindre eller lik stringens lengde
		for (int i = 1; i <= inputTextLength; i++) {
			cacheText = inputText.charAt(inputTextLength-i); 
			// Oppdaterer output teksten hver gang l�kka kj�rer slik at den reverserte teksten, 'output', blir generert
			output += Character.toString(cacheText);
		}
		
		System.out.printf("\nSetningen du skrev blir baklengs:\n--> %s", output);		
		input.close();
	}
}