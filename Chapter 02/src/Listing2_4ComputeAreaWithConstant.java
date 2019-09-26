import java.util.Scanner;

public class Listing2_4ComputeAreaWithConstant {

	public static void main(String[] args) {
		// 
		
		double radius;
		double area;
		final double PI = 3.14159;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for radius: ");
		radius = input.nextDouble();
		
		area = radius * radius * PI;
		
		System.out.printf("The area for the circle of radius %.2f is %.2f", radius, area);
		
		input.close();
	}

}
