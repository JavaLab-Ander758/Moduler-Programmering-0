import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		// 
		int test = 0;
		Scanner input = new Scanner(System.in);
		String testString = "";
		//int i = 0;
		
		for (int i = 1; i < 5; i++) {
			System.out.print("Enter a value for test: ");
			test = input.nextInt();
			input.nextLine();
			System.out.print("Enter a string for testString: ");
			testString = input.nextLine();
		}
		/*
		while (true) {
			System.out.print("Enter a value for test: ");
				test = input.nextInt();
			
			i++;
			if (i == 5)
				break;
		}*/
		
		System.out.println(test + testString);
	}
}