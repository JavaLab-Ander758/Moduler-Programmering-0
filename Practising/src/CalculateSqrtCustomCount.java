import java.util.Scanner;

public class CalculateSqrtCustomCount {

	public static void main(String[] args) {
		
		double counter = 0;
		double sqrtNumber;
		double numberOfSqrts;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programmet kalkulerer �nsket antall kvadratrot med tilpasset n�yaktighet");
		System.out.println();
		System.out.print("Hvor h�yt vil du kalkulere kvadratroten til?: ");
		numberOfSqrts = input.nextDouble();
		
		while(true) {
			sqrtNumber = Math.sqrt(counter);
			sqrtNumber = Math.sqrt(counter);
			System.out.printf("Kvadratroten av %.2f er %.2f", counter, sqrtNumber);
			System.out.println();
			counter++;
			
			if (counter > numberOfSqrts) {
				System.out.println();
				counter--;
				System.out.printf(" ---------- Du har n� kalkulert kvadratroten av %.2f som er ", counter); System.out.print(Math.sqrt(counter) + " ----------");
				break;
			}
		}
	input.close();
	}

}