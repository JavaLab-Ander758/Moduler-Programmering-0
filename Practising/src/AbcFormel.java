import java.util.Scanner;

public class AbcFormel {

	public static void main(String[] args) {
		// 
		double a, b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.println(" - Programmet kalkulere + og - i abc-formelen -");
		
		System.out.print("Skriv inn verdi for a: ");
		a = input.nextDouble();
		System.out.print("Skriv inn verdi for b: ");
		b = input.nextDouble();
		System.out.print("Skriv inn verdi for c: ");
		c = input.nextDouble();
		System.out.println(); System.out.println();
		
		double positiveAbcFormulaResult = (-b + Math.sqrt((Math.pow(b, 2)) - 4 * a * c)) / (2 * a);
		double negativeAbcFormulaResult = (-b - Math.sqrt((Math.pow(b, 2)) - 4 * a * c)) / (2 * a);
		
		System.out.printf("Abc-formelen med verdiene %.2f, %.2f og %.2f gir x_+=%.3f og x_-=%.3f som resultat"
							, a, b, c, positiveAbcFormulaResult, negativeAbcFormulaResult);
		
		input.close();
	}

}