import java.util.Random;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		String output = "";
		int n, minValue = 65, maxValue = 90, x = 0, timeMillis_0 = (int) System.currentTimeMillis();			
		Random rand = new Random();		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many letters do you want per output? : ");
			int k = input.nextInt(); 
			input.close();
		
		while (true) {
			
			for (int i = 1; i <= k; i++) {
				n = rand.nextInt((maxValue - minValue) + 1) + minValue;			
				
				output += Character.toString((char) n);			
				
				if (i == k) {
					x++;
					System.out.printf("%s, String length: %d, Random lines generated so far(x): %d so far (!) ", output, k, x);
					System.out.printf("		x^x: %s		x^2: %s", Math.pow(x, x), Math.pow(x, 2));
					System.out.printf("		Time since first printed output: %s", ((int) System.currentTimeMillis()/1000) - (timeMillis_0 / 1000) );
					
					System.out.print("	\n	");
					output = "";
				}
				
			}
			
		}	
	
	}

}