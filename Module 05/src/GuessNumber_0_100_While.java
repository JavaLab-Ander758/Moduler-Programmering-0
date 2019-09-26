import java.util.Scanner;

public class GuessNumber_0_100_While {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Geberate a random numebr to be guessed
		
		int number = (int)(Math.random() * 101); // 0 til 100
		
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");
				
		int guess = -1;
		while (guess != number) {
			// Prompt the user to guess the random number
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();
			
			if (guess == number) {
				System.out.printf("--> Yes, the number is %s!", number);
			} else if (guess > number) {
				System.out.println("--> Your guess is too high, try again!\n");
			} else if (guess < number) {
				System.out.println("--> Your guess is too low, try again!\n");
				
		}
			
	}
	}
}
