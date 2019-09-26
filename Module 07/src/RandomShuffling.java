import java.util.Scanner;

public class RandomShuffling {

	public static void main(String[] args) {
		// Shuffle values in an array
		
		Scanner input = new Scanner(System.in);
		System.out.print("Hvor lang vil du ha arrayen?: ");
		int n = input.nextInt();
		int[] myList = new int[n];
		
		System.out.print("\nSkriv inn verdiene i arrayen under:\n");
		for (int i = 0; i < myList.length; i++) {
			System.out.printf(" -> [%d] = ", i);
			myList[i] = input.nextInt();
		}
		input.close();
		
		for (int i = 0, r; i < myList.length; i++) {
			r = (int)(Math.random() * myList.length);
			
			// Swap myList[i] with myList[r]
			int temp = myList[i];
			myList[i] = myList[r];
			myList[r] = temp;
			
			if (i == 0)
				System.out.println("myList shuffled randomly: \n");
			System.out.printf("myList[%d] = %d \n", i, myList[i]); 
		}
	}
}
