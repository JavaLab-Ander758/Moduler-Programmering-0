import java.util.Scanner;

public class NumericDataTypes {

	public static void main(String[] args) {
		// +, -, *, /, %
		
		int minutter;
		int sekunder;
		Scanner input = new Scanner(System.in);
		System.out.println("Gi inn antall sekuder : " );
		int antallSekunderFraBruker = input.nextInt();
		minutter = antallSekunderFraBruker / 60;
		sekunder = antallSekunderFraBruker % 60; 
		System.out.println(antallSekunderFraBruker + " sekunder er " + minutter + " minutter og " + sekunder + " sekunder");
	}

}
