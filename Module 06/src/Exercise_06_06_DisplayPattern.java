import java.util.Scanner;
public class Exercise_06_06_DisplayPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("How long do you want your pattern?: ");
			int size = input.nextInt();
			input.close();
		String output = "", outputCache;
		
		for (int i = 1; i <= size; i++) {
		outputCache = Integer.toString(i);
		output += " " + outputCache;
		System.out.println(output);
		}
		
	}
	
}
