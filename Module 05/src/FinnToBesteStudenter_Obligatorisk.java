import java.util.Scanner;

public class FinnToBesteStudenter_Obligatorisk {

	public static void main(String[] args) {
		// Finn beste studenter per score blandt n-antall studenter
		
		int n; // antall studenter
		int topScore = 0, nextTopScore = 0, score = 0;
		String topName = "", nextTopName = "", name;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Hvor mange studenter vil du teste score for?: ");
			n = input.nextInt();
		
		System.out.println("\nOppgi studentenes score og navn\n");
		
		for (int i = 0; i < n; i++){
			System.out.printf("Student nr: %d", (i + 1) );
			System.out.print("\n--> Score ");
				score = input.nextInt();
			
			input.nextLine();	// bruker  en eksta .nextLine() for at String'en skal kunne leses in i for-løkka 
			System.out.print("--> Navn: ");
				name = input.nextLine();
			
			// Tester hvor høy score er og evt. omplasserer de med første-, og nest-første plass
			if (score > topScore){
				nextTopScore = topScore;
				nextTopName = topName;
				topScore = score;
				topName = name;
			} else if (score >= nextTopScore && score <= topScore){
				nextTopScore = score;
				nextTopName = name;
			}
		}
		System.out.printf("\n\nTop to studenter:\n");
		System.out.printf(" - Første plass: %s med score: %d\n",topName, topScore);
		System.out.printf(" - Andre plass: %s med score: %d",nextTopName, nextTopScore);
		input.close();
	}
}