import java.util.Scanner;

public class Listing2_3ComputeAverage {

	public static void main(String[] args) {
		// 
		double number1, number2, number3, average;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		System.out.println();
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		number3 = input.nextDouble();

		average = (number1 + number2 + number3) / 3;
		
		System.out.printf("The average of %.0f, %.0f and %.0f is %.2f :-)", number1, number2, number3, average);

		input.close();
	}

}