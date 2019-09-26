import java.util.Scanner;

public class Exercise2_7_FindTheNumberOfYears {

	public static void main(String[] args) {
		// Minutes to days and minutes
		
		int minutesInput;
		double years, days;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number of minutes in integer: ");
		minutesInput = input.nextInt();
		System.out.println();
		
		years = minutesInput / (365 * 24 * 60);
		days = (minutesInput % (365 * 24 * 60)) / (24 * 60); /* Collecting remainder of years from minutesInput and 
																extracting the days by dividing with (24h * 60min) */
		
		System.out.println();
		System.out.println(minutesInput + " minutes is " + years + " years " + days + "days");
		
		input.close();
	}

}
