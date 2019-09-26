import java.util.Scanner;

public class Exercise2_2ComputeColumeOfTriangle {

	public static void main(String[] args) {
		// area of equilateral triangle = ((sqrt(3) / (4)) * length^2  Volumer of equilateral triangle = area*length
		
		double length, area, volume;
		Scanner input = new Scanner(System.in);
		
		System.out.println(" - The program calculates the volume of an equilateral triangle");
		System.out.println();
		
		System.out.print("Enter length of one side from the equilateral triangle: ");
		length = input.nextDouble();
		
		area = ( (Math.sqrt(3.0)) / (4) ) * (Math.pow(length, 2));
		volume = (double)area * length;
		
		System.out.println();
		System.out.printf("The area is %.2f", area);
		System.out.println();
		System.out.printf("The volume of the Triangular prism is %.2f", volume);
		
		input.close();
	}

}
