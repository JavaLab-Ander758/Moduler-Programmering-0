import java.util.Scanner;

public class Exercise_4_08_CharToASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userInput;
		char cache;
		int ASCII;
		Scanner input = new Scanner(System.in);		
		
		System.out.print("Enter a character: ");
		userInput = input.nextLine();
		
		cache = userInput.charAt(0);
		ASCII = (int)cache;
		
		System.out.printf("The ASCII code for character %s is %d", userInput, ASCII);
		
	}

}