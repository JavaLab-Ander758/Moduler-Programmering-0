import java.util.Scanner;

public class Exercise_4_04_AreaOfHexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double s, area;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the side of the hexagon: ");
		s = input.nextDouble();
		
		area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
		System.out.printf("\nThe area of the hexagon is %.2f", area);
	}

}
