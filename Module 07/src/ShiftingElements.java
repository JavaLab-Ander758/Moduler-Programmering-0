
public class ShiftingElements {

	public static void main(String[] args) {
		// 
		
		int[] myList = new int[10];
		for (int i = 0; i < myList.length; i++)
			myList[i] = i + 1;
		
		System.out.println("Before:");
		for (int i = 0; i < myList.length; i++)
			System.out.printf("myList[%d] = %d \n", i, myList[i]);
		
		
		int temp = myList[0]; // Retain the first element
		
		// Shift elements left
		for (int i = 1; i < myList.length; i++)
			myList[i - 1] = myList[i];
		
		// Move the first element to fill in the last position
		myList[myList.length - 1] = temp;
		
		// Print the myList
		System.out.print("\nAfter:\n");
		for (int i = 0; i < myList.length; i++)
			System.out.printf("myList[%d] = %d \n", i, myList[i]);
	}

}
