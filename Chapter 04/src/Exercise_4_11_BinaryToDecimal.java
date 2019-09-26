import java.util.Scanner;

public class Exercise_4_11_BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String binary;
		int a, b, c, d;
		char cache;
		Scanner input = new Scanner(System.in);
		
		//abcd
		System.out.print("Enter binary digits (0000 to 1111): ");
		binary = input.nextLine();
		
		cache = binary.charAt(0);
			a = (int)cache;
		cache = binary.charAt(1);
			b = (int)cache;
		cache = binary.charAt(2);
			c = (int)cache;
		cache = binary.charAt(3);
			d = (int)cache;
		
		if (a == 48) {
			a = 0;
		} else {
			a = 1;
		}
		if (b == 48) {
			b = 0;
		} else {
			b = 1;
		}
		if (c == 48) {
			c = 0;
		} else {
			c = 1;
		}
		if (d == 48) {
			d = 0;
		} else {
			d = 1;
		}
		
		int decimal = (int) ((a*Math.pow(2, 3)) + (b*Math.pow(2, 2)) + (c*Math.pow(2, 1)) + (d * Math.pow(2, 0)));
		
		System.out.printf("\nThe decimal value is %d", decimal);
	}

}
