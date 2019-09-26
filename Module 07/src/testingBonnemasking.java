import java.util.*;
public class testingBonnemasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int maxIndex = 4;
		//int maxIndex = max(slots);
		
		
		
		int[] slots = {1,1,5,3};
		int maxIndex = 0;
		for (int i = 0; i < slots.length; i++)
			if (slots[i] > maxIndex)
				maxIndex = slots[i];

		int[][] matrice = new int[maxIndex][slots.length];
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				if (slots[j] >= maxIndex)
					matrice[i][j] = 1;
			}
			maxIndex--;
		}
		
		for ( int[] array : matrice )
			System.out.println( Arrays.toString( array ) );
		
		
		for(int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++)
				System.out.printf("[%d][%d]=%d ", i, j, matrice[i][j]);
			
			System.out.println();
		}
		
		
	}

}
