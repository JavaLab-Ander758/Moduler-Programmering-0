import java.util.Scanner;

public class Exercise_06_07_FutureInvestmentValue {

	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
		
		System.out.print("The amount invested: ");
			double investmentAmount = input.nextDouble();
		System.out.print("Annual interest rate: ");
			double annualInterestRate = input.nextDouble();
		System.out.print("How many years do you want to invest?: ");
			int years = input.nextInt();
		input.close();
		
		System.out.print("\nYears:\tFuture value:\n");
		for (int i = 1; i <= years; i++) {
			double futureValue = futureInvestmentValue(investmentAmount, annualInterestRate/1200, i);
			System.out.printf("%s\t%.2f\n", i, futureValue);
		}
		
	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		double futureInvestmentValue = investmentAmount * (Math.pow(1 + monthlyInterestRate, years * 12));
		return futureInvestmentValue;
	}

}