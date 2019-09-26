import java.util.Scanner;

public class FindingTheLargestElement {

	public static void main(String[] args) {
		// Find highest number in an array
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hvor lang vil du ha arrayen?: ");
			int n = input.nextInt();
		System.out.print("\nMinste mulige verdi: ");
			int min = input.nextInt();
		System.out.print("\nStørste mulige verdi: ");
			int max = input.nextInt();
		input.close();
		
		int[] randomArray = new int[n];
		
		int highest = randomArray[0], laveste = randomArray[0]+1;
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int)(Math.random() * (max - min) + 1)  + min;
			if (randomArray[i] > highest)
				highest = randomArray[i];
			if (randomArray[i] < laveste)
				laveste = randomArray[i];
			
			System.out.println(randomArray[i]);
		}
		System.out.printf("\nHøyeste verdi fra %d til %d er %d \nLaveste verdi er %d", min, max, highest, laveste);
		
	}
}