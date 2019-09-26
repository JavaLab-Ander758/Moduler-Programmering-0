import java.util.Scanner;

public class Listing_3_03_SubstractionQuiz {

	public static void main(String[] args) {
		//
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		System.out.print("What is " + number1 + " - " + number2 + "? :");
		int answer = input.nextInt();
		
		if (number1 - number2 == answer) {
			System.out.println("You are correct!");
		} else {
			System.out.println("You are wrong.");
			System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
		}
	}

}