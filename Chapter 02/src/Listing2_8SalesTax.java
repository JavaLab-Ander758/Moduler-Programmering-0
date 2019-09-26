import java.util.Scanner;

public class Listing2_8SalesTax {

	public static void main(String[] args) {
		// 
		
		double purchaseAmount;
		double tax;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter purchase amount: ");
		purchaseAmount = input.nextDouble();
		System.out.println();
		
		tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);

		input.close();
	}

}
