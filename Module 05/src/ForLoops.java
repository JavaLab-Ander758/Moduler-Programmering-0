
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
		
		// for løkker med flere variabler
		/*
		 for (int i = 0, j = 0; (i+j < 10); i++, j++){
		 	statements(s);
		 }
		*/
		
		// Evig for-løkke
		/*
		for (;;) {
			statements(s);
		}
		*/
		
		// Evig while-løkke
		/*
		 while (true) {
		 	statements(s);
		 }
		 * 
		 */
	}

}
