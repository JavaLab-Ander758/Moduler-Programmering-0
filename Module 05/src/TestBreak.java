
public class TestBreak {

	public static void main(String[] args) {
		
		int sum = 0, number = 0;
		
		while (number < 20) {
			number++;
			sum += number;
			if (sum >= 100)
				break; // Avslutte while l�kka dersom sum blir h�yere eller lik 100, selv om while l�kka ikke er fullf�rt
		}
		
		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
	}
}