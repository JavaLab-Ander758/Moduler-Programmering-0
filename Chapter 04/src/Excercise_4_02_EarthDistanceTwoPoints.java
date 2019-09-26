import java.util.Scanner;

public class Excercise_4_02_EarthDistanceTwoPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1, x2, y1, y2, distance;
		final double RADIUS = 6371.01;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter point 1 in degrees: \n");
		System.out.print(" --> latitude ");
			x1 = Math.toRadians(input.nextDouble());
		System.out.print(" --> longitude ");
			y1 = Math.toRadians(input.nextDouble());
		System.out.print("Enter point 2 in degrees: \n");
		System.out.print(" --> latitude ");
			x2 = Math.toRadians(input.nextDouble());
		System.out.print(" --> longitude ");
			y2 = Math.toRadians(input.nextDouble());
		
		distance = RADIUS * (Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));

		System.out.printf("\nThe distance between the two points is %s km", distance);
		input.close();
	}

}
