import java.util.Scanner;

public class Exercise_06_14_EstimatePiMethod {

	public static void main(String[] args) {
		// Print ut hvert 101 ledd for tilnærming av pi
		
		Scanner input = new Scanner(System.in);
		System.out.print("Hvor mange 100ledd ønsker De?: ");
			int ledd = input.nextInt()*100;
		
		generatePi(ledd);
	}
		
	public static void generatePi(int ledd) {
		double sum = 0;
		System.out.print("\ni\t\tm(i)\n----------------------\n");
		for (int i = 1; i <= ledd; i++) {
			sum += 4 * ((Math.pow(-1, i + 1)) / (2 * i - 1.0));
			
			if (i % 100 == 1)
				System.out.printf("%s\t\t%.4f\n", i, sum);
		}
		
	}
}