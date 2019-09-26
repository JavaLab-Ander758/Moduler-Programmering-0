
public class TestBreak {

	public static void main(String[] args) {
		
		int sum = 0, number = 0;
		
		while (number < 20) {
			number++;
			sum += number;
			if (sum >= 100)
				break; // Avslutte while løkka dersom sum blir høyere eller lik 100, selv om while løkka ikke er fullført
		}
		
		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
	}
}