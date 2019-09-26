import java.util.Scanner;

public class Listing2_5DisplayTime {

	public static void main(String[] args) {
		// 
		double seconds, minutes, remainingSeconds;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer for seconds: ");
		seconds = input.nextInt();
		minutes = seconds / 60;
		remainingSeconds = seconds % 60;
		
		System.out.printf("%.0f seconds is %.0f minutes and %.0f seconds", seconds, minutes, remainingSeconds);
		
		input.close();
	}

}
