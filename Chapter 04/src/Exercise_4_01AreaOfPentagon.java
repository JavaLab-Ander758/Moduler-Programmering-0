import java.util.Scanner;

public class Exercise_4_01AreaOfPentagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r, s, area;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length from the center to a vertex: ");
			r = input.nextDouble();
		
		s = 2 * r * Math.sin(Math.PI / 5);
		area = (5 * Math.pow(s, 2)) / (4 * (Math.tan((Math.PI / 5))) );
		
		System.out.printf("The area of the pentagon is %.2f", area);
		input.close();
	}

}
