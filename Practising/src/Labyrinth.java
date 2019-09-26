import java.util.Scanner;

public class Labyrinth {

	public static void main(String[] args) {
		// Labyrinth
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hvor lang horisontal vil du ha labyrinten?: ");
			int x = input.nextInt();
		System.out.print("Hvor høy vil du ha labyrinten?: ");
			int y = input.nextInt();
		int perimeter = x * y;
			
		for (int i = 0, random, h = 0, c = 1; i < perimeter; i++, c++) {
			
			//if (h == y)
			//	break;
			
			random = (int) (Math.random()* 2); // [0,1]
			
			if (random == 0) {
				System.out.print("/");
			} else {
				System.out.print("\\");
			}
			
			if (c == x) {
				if (i == perimeter)
					break;
				System.out.print("\n");
				c = 0;
				h++;
			}
		}
		input.close();
	}
}
