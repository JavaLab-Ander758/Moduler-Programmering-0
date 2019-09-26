import java.util.Scanner;

public class Exercise_4_05_AreaOfRegularPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		double s, area;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of sides: ");
			n = input.nextInt();
		System.out.print("Enter the side: ");
			s = input.nextDouble();
		
		area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
		System.out.printf("The area of the polygon is %.2f", area);
		
		input.close();
	}

}