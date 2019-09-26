
public class TestContinue {

	public static void main(String[] args) {
		
		int sum = 0, number = 0;
		
		while (number < 20) {
			number++;
			if (number == 10 || number == 11) continue; // Dersom number == 10 eller 11, fortsetter den løkka uten å summere opp 10 og 11.
								// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + _ + _ + 12 + 13 + 15 + 16 + 17 + 18 + 19 + 20  =  189
			sum += number;
		}
		
		System.out.println("The sum is " + sum);	
	}
}
