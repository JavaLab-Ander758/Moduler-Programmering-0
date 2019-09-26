import java.util.Scanner;

public class CustomDiceProbability {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn antall sider på terningen din: ");
			int numberOfSides = input.nextInt();
		System.out.printf("Skriv inn antall kast for den %d-kantede terningen: ", numberOfSides);
			int numberOfTries = input.nextInt();
		input.close();
		
		int min = 1, max = numberOfSides;
		int success = 0;
		for (int i = 0; i < numberOfTries; i++) {
			if ((int)((int)(Math.random() * ((max - min) + 1)) + min) == 1)
				success++;
		}
		System.out.printf("\nMed %d kast fikk vi %d enere på den %d-kantede terningen \n", numberOfTries, success, numberOfSides);
		double probability = (double)success / numberOfTries;
		System.out.printf("P(én side) =  %.10f \n", probability);
		double finalProbability = probability * numberOfSides;
		System.out.printf("P(én side) * %d = %s \n", numberOfSides, finalProbability );
	}

}
