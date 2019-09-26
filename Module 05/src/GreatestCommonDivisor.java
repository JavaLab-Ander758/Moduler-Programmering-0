import java.util.Scanner;
public class GreatestCommonDivisor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		int gcd = 1;
		int k  = 2;
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
			k++;
		}
		
		System.out.printf("The greatest common divisor for %d and %d is %d", n1, n2, gcd);
		
	}

}
