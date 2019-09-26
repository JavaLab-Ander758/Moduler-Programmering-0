import java.util.Scanner;

public class SummerDiagonalenIMatrisenOBLIGATORISK {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//int [][] testList = {{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,6,7}};
		int [][] testList = new int[4][4];
		double sum = 0;
		
		// Generate matrix table 4x4 with user input
		System.out.println("Oppgi en 4x4 matrix rad for rad, bruk <enter> for hver rad og mellomrom mellom hver verdi:");
		// rad(i)
		for (int i = 0; i < testList.length; i++) {
			// verdi(j) i rad(i)
			for (int j = 0; j < testList[i].length; j++) {
				testList[i][j] = input.nextInt();
			}
		}
		input.close();
		
		// Output the matrix
		System.out.print("\nTabellen du skrev inn ble:\n");
		for(int i = 0; i < testList.length; i++) {
			for(int j = 0; j < testList.length; j++)
				System.out.printf("%2d ", testList[i][j]);
			System.out.println();
		}
		
		// Calculate the diagonal sum in the matrix
		for (int i = 0; i < testList.length; i++) {
			sum += testList[i][i];
		}
		System.out.printf("\nSummen av tall i diagonalen er: %d \n", sum);
		System.out.printf("Gjennomsnittet av tall i diagonalen er: %d", sum / (testList[0].length));
	}

}



