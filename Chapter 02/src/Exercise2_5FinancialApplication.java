import java.util.Scanner;

public class Exercise2_5FinancialApplication {

	public static void main(String[] args) {
		// 
		
		double subTotal, gratuityRate, gratuityResult, totalResult;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value for subtotal: ");
		subTotal = input.nextDouble();
		System.out.print("Enter value for gratuity rate: ");
		gratuityRate = input.nextDouble()/ 100; // Grabbing percent from input
		System.out.println();
		
		gratuityResult = subTotal * gratuityRate;
		totalResult = subTotal + gratuityResult;
		
		System.out.printf("The gratuity is $%.1f and total is $%.1f", gratuityResult, totalResult);
		
		input.close();
	}

}
