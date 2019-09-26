import java.util.Scanner;

public class Exercise2_3ConvertMetersIntoFeet {

	public static void main(String[] args) {
		// 1 meter = 3.2786 feet
		
		double metersToFeetCalculation, meters;
		final double FEET_CONSTANT = 3.2786;
		Scanner input = new Scanner(System.in);
		System.out.println("- The program converts meters to feet -");
		System.out.println();
		
		System.out.print("Enter a value in meters: ");
		meters = input.nextDouble();
		System.out.println();
		
		metersToFeetCalculation = meters * FEET_CONSTANT;
		
		System.out.printf("%.1f meters is %.3f feet", meters, metersToFeetCalculation);
		
		input.close();
	}

}
