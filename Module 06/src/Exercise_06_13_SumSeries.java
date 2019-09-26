import java.util.Scanner;

public class Exercise_06_13_SumSeries {

	public static void main(String[] args) {
		// ledd = i / (i + 2)
		
		Scanner input = new Scanner(System.in);
		System.out.print("Hvor mange ledd ønsker du?: ");
			int ledd = input.nextInt();
			input.close();
		computeSeries(ledd);
		
	}
	public static void computeSeries(int ledd) {
		double m, sum = 0;
		System.out.printf("\ni\tm(i) \n--------------\n");
		for (int i = 1; i <= ledd; i++) {
			m = i / (i + 2.0);
			sum += m;
			System.out.printf("%s\t%.4f \n", i, sum);
		}
	}
}
