
public class Oppgave1 {

	public static void main(String[] args) {
		
		// Oppgave a
		int[] numbers = {1,2,3,4,5,7,1,8};
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%s ", numbers[i]);
		}
		
		// Oppgave b
		int[][] numbersIn2Dim = { {1, 23, 43, 2},	{43, 12, 234, 15},	{43, 82, 264, 35}};
		int sum = 0, count = 0;
		for (int i = 0; i < numbersIn2Dim.length; i++) {
			for (int j = 0; j < numbersIn2Dim[i].length; j++) {
				sum += numbersIn2Dim[i][j];
				count++;
			}
		}
		System.out.printf("\n\nGjennomsnittet av de %s tallene i den todimensjonale tabellen er %s \n\n", count, sum/count);
		
		// Oppgave c
		printNumbers(11,47,10);
		}
	
	// c
	static void printNumbers(int num1, int num2, int numbersPerLine) {
		int count = 0;
		for (int i = num1; i <= num2; i++) {
			System.out.printf("%d ", i);
			count++;
			
			if (count == numbersPerLine) {
				System.out.println();
				count = 0;
			}
		}
	}
	
	
	

}
