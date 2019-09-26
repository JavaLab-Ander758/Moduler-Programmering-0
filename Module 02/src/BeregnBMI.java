import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BeregnBMI {

	public static void main(String[] args) {
		// BMI = weight/height^2 = kg/m^2
		
		double weight;
		double height;
		double BMI;
		Scanner input = new Scanner(System.in);
		
		System.out.println("- Programmet genererer din BMI -");
		System.out.println();
		System.out.print("Oppgi din vekt i kilogram: ");
		weight = input.nextDouble();
		System.out.print("Oppgi høyde i centimeter: ");
		height = input.nextDouble() / 100;
		
		BMI = weight / Math.pow(height, 2.0);
		System.out.printf("Din BMI er: %.2f", BMI);
		System.out.println();
		System.out.println();
		
		if (BMI < 18.5) {
			System.out.println("Du er undervektig, prøv å spis mer mat!");
		} else if (BMI > 18.5 && BMI <= 24.9) {
			System.out.println("Du har normal vekt, gratulerer!");
		} else if (BMI > 24.9 && BMI <= 29.9) {
			System.out.println("Du er overvektig");
		} else /* if(BMI > 29.9) */ {
			System.out.println("Du er veldig overvektig, slank deg!");
		}
		
		input.close();
	}

}
