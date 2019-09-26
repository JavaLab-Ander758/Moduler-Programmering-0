
public class SkrivUtPyramiden {

	public static void main(String[] args) {
		
/*
                            1
                        1   2   1
                    1   2   4   2   1
                1   2   4   8   4   2   1
            1   2   4   8  16   8   4   2   1
        1   2   4   8  16  32  16   8   4   2   1
    1   2   4   8  16  32  64  32  16   8   4   2   1
1   2   4   8  16  32  64 128  64  32  16   8   4   2   1
*/
		
	int number = 0; // Tall som skal skrives ut
	
	for (int row = 0; row <= 7; row++) {
		// Legg på nødvengide mellomrom for raden
		for (int col = 1; col <= 7 - row; col++)
			System.out.printf("%4s", " ");
		
		// Skriv ut første halvparten av raden
		for (int col = 0; col <= row; col++) {
			number = ( int ) Math.pow(2, col);
			
			System.out.printf("%4d", number);
		}
		
		// Skriv ut andre halvparten av raden
		for (int col = row - 1; col >= 0; col--) {
			number = ( int ) Math.pow(2, col);
			System.out.printf("%4d", number);
		}
		// Start a new line
		System.out.println();
	}
		
		
		
		
		
		
		
		
	}

}
