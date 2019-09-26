import java.util.Scanner;

public class Listing2_2ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		// 
		double radius;
		double area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for radius: ");
		radius = input.nextDouble();
		
		area = radius * radius * 3.14159;
		
		System.out.println("The area for the circle of radius " + radius + " is " + area);
		
		input.close();
	}

}
