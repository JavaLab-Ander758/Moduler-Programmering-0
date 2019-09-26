import java.util.Scanner;

public class TallOverUnderEllerLiktMedEtAnnetTall {

	public static void main(String[] args) {
		// 
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv inn verdier: ");
		int[] myList = new int[11];
		for (int i = 0; i < myList.length; i++) {
			System.out.printf("myList[%d] = ", i);
			myList[i] = input.nextInt();
		}
		
		while(true) {
			System.out.print("\nSkriv inn nummeret i lista di for å finne ut om det er større, mindre eller lik den siste i rekka \n" + "myList[x], x = ");
			int x = input.nextInt();
			
			if (myList[x] > myList[myList.length - 1])
				System.out.printf("myList[%d] er større enn myList[%d] \n", x, myList.length-1);
			else if (myList[x] < myList[myList.length - 1])
				System.out.printf("myList[%d] er mindre enn myList[%d] \n", x, myList.length-1);
			else if (myList[x] == myList[myList.length - 1])
				System.out.printf("myList[%d] er likt myList[%d] \n", x, myList.length-1);
			System.out.println("______________________________________________________________________________________________________________");
		}
		
	}
}