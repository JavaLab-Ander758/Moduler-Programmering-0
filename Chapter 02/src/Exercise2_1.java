import java.util.Scanner;

public class Exercise2_1 {

	public static void main(String[] args) {
		// Convert miles to km, 1 mile = 1.6 km
		
		double miles;
		Scanner input = new Scanner(System.in);
		System.out.println(" - Programmet konverterer miles til kilometer");
		System.out.println();
		
		System.out.print("Enter miles: ");
		miles = input.nextDouble();
		System.out.println();
		
		double convertKilometers = miles * 1.6;
		System.out.printf("%.2f miles  is %.2f kilometers", miles, convertKilometers);
		
		input.close();
	}

}
