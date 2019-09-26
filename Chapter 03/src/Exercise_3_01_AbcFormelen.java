import java.util.Scanner;

public class Exercise_3_01_AbcFormelen {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		//	
		double a, b, c;
		
		System.out.println("This program solves the quadratic equations for values a, b and c\n-----------------------------------------------------------------\n");
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter values for your equation: ");
			System.out.print("	Value for a: ");
				a = input.nextDouble();
			System.out.print("	Value for b: ");
				b = input.nextDouble();
			System.out.print("	Value for c: ");
				c = input.nextDouble();
		
		// Checking the discriminant of the quadratic equation
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		
		if (discriminant > 0) {
				// 2 real roots
			double positiveEquation = (-b + Math.sqrt((Math.pow(b, 2)-4*a*c))) / (2*a);
			double negativeEquation = (-b - Math.sqrt((Math.pow(b, 2)-4*a*c))) / (2*a);
			System.out.printf("The equation has two roots ->	%f and %f", positiveEquation, negativeEquation);
		} else if (discriminant == 0) {
				// 1 real root
			double oneRealEquation = (-b + Math.sqrt((Math.pow(b, 2)-4*a*c))) / (2*a);
			System.out.printf("The equation has one root ->		%f", oneRealEquation);
		} else if (discriminant < 0) {
				// no real roots
			System.out.print("No real roots since b^2-4ac = negative answer");
		}
		System.out.print("\n------------------------------\n\n");
		}
	}

}