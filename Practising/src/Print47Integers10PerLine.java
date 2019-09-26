import java.util.Scanner;

public class Print47Integers10PerLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 10; 
		
		for (int i = 1; i <= (47 - j); i++) {
			System.out.printf("%s ", i + j);
			if (i % 10 == 0)
				System.out.print("\n");
		}
		System.out.println("\n\n\n\n");
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn A eller D");
			String stringInput = input.nextLine();
			char selection = stringInput.charAt(0);
		//sele
		if (selection == 'A' || selection == 'D')
			System.out.println("Du valgte A eller D \n");
		else if (selection == 'B')
			System.out.println("Du valgte B");
		else if (selection == 'C')
			System.out.println("Du valgte C");
		else
			System.out.println("Ikke noe særlig god med bokstaver...");
		
		System.out.println("\n\n\n");
		
		switch (selection) {
			case 'A':
			case 'D':
				System.out.println("Du valgte A eller D \n");
				break;
			case 'B':
				System.out.println("Du valgte B");
				break;
			case 'C':
				System.out.println("Du valgte C");
				break;
		}
		
		
	}

}
