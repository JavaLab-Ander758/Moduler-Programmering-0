import java.util.Scanner;

public class ComputeArea_input {

	public static void main(String[] args) {
		
		double radius;	//a - Z, 0 - 9, _, $
		double area;
		final double Pi = 3.14159;
		Scanner input = new Scanner(System.in);
			//print gir ikke linjeskift..
		System.out.print("Gi inn radius : ");
		radius = input.nextDouble();
		area = radius*radius * Pi;
		System.out.println("Aealet av en sirkel med radius " + radius + " er: " + area);	

		
	}
}