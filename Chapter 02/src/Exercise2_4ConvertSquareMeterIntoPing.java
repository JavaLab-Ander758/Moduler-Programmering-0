import java.util.Scanner;

public class Exercise2_4ConvertSquareMeterIntoPing {

	public static void main(String[] args) {
		// 1 m^2 = 0.3025 ping (taiwaneese measurement)
		
		double squareMetersInput, squareMetersToPingResult;
		final double PING = 0.3025;
		Scanner input = new Scanner(System.in);
		
		System.out.println("- The program converts square meters into ping");
		System.out.println();
		
		System.out.print("Enter a number in square meters: ");
		squareMetersInput = input.nextDouble();
		System.out.println();
		
		squareMetersToPingResult = squareMetersInput * PING;
		
		System.out.printf("%.1f square meters is %.3f pings", squareMetersInput, squareMetersToPingResult);
		
		input.close();
	}

}
