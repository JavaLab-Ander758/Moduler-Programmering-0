import java.util.Scanner;

public class GenerateRandomNumbersAverage {

	public static void main(String[] args) {
		// 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Hvor mange tilfeldige nummer vil du generere?: ");
			int n = input.nextInt();
			int[] randomArray = new int[n];
		System.out.print("\nHva vil du ha tallene mellom? \n\t-> Min: ");
			int min = input.nextInt() - 1;
		System.out.print("\t-> Max: ");
			int max = input.nextInt();
		input.close();

		long startTime = System.currentTimeMillis();
		long sum = 0;
		for (int i = 0, randomNumber; i < randomArray.length; i++) {
			randomNumber = (int)(Math.random() * (max - min) + 1) + min;
			randomArray [i] = randomNumber;
			System.out.printf("[%d] = %d ", i, randomArray[i]);
			
			if (i % 5 == 0 && i != 0)
				System.out.print("\n");
			sum += randomArray[i];
			
			if (i == randomArray.length - 1)
				System.out.printf("\n\nAlle tallene i arrayen summert er %d \nGjennomsnittet av dette er %.2f", sum, sum/(i + 1.0));
		}
		long stopTime = System.currentTimeMillis();
		double elapsedTime = stopTime - startTime;
		System.out.printf("\nKalkulasjonen tok %.3f sekunder", elapsedTime / 1000);
	}
}

