
public class ForLoops {

	public static void main(String[] args) {
		// 
		
		int i, testCounter = 0;
		
		for (i = 0; i < 100; i++) {
			System.out.println("Welcome to java!");
			testCounter++;
		}
		
		System.out.println(testCounter);
		
		/*
		 for (initial-action; loop-continuation-condition; action-after-each-iteration){
		 	// Loop body
		 	statements(s);
		 }
		*/
		
		// for l�kker med flere variabler
		/*
		 for (int i = 0, j = 0; (i+j < 10); i++, j++){
		 	statements(s);
		 }
		*/
		
		// Evig for-l�kke
		/*
		for (;;) {
			statements(s);
		}
		*/
		
		// Evig while-l�kke
		/*
		 while (true) {
		 	statements(s);
		 }
		 * 
		 */
	}

}
