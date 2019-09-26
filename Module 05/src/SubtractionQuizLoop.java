import java.util.Scanner;

public class SubtractionQuizLoop {

	public static void main(String[] args) {
		// Interactive subtraction quiz with outputting statistics for the user at end of quiz 
		
		final int NUMBER_OF_QUESTIONS = 5; // Number of questions
		int correctCount = 0; //  Count the number of correct answers
		int count = 0; // Count the number of questions
		long startTime = System.currentTimeMillis();
		String output = ""; // output string is initially empty
		Scanner input = new Scanner(System.in);
		
		while (count < NUMBER_OF_QUESTIONS) {
			// 1. Generate two random single-digit integers
			int number1 = (int)(Math.random() * 10); // 0 -> 9
			int number2 = (int)(Math.random() * 10); // 0 -> 9
			
			// 2. If number1 < number2, swap number1 with number2
			if (number1 < number2) {
				int numberCache = number1;
				number1 = number2;
				number2 = numberCache;
			}
			
			// 3. Prompt the student to answer "What is number1 - number2?"
			System.out.printf("What is %d - %d ?: ", number1, number2);
			int answer = input.nextInt();
			
			// 4. Grade the answer and display the result
			if (number1 - number2 == answer) {
				System.out.println("\nYou are correct!");
				correctCount++;
			} else {
				System.out.printf("\nYour answer is wrong.\n%d - %d should be ",number1, number2); System.out.println(number1 - number2);
			}
			
			// Increase the count
			count++;
			
				// Output blir større og større og genererer til slutt antall setninger lik verdien av numberOfQuestions
			output += "\n" + number1 + "-" + number2 + " = " + answer + ((number1 - number2 == answer ? " correct" : " wrong"));
		}
		
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		
		System.out.printf("------------------------------\nCorrect count is %d", correctCount);
		System.out.println("\nElapsed time is " + elapsedTime / 1000 + " seconds" + output); // elapsedTime/1000 for å endre millisekund til sekunder
		
		input.close();
	}
}