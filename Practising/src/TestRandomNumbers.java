public class TestRandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int random , highest = 0, lowest = 0, cacheHigh = 0, cacheLow = 0;;
		final int LIMIT = 1000000;
		
		for (int i = 0; i < LIMIT; i++) {
			random = (int)(Math.random() * (65535 + 1));
			if (i == 0) {
				highest = random;
				lowest = random;
			}
			
			if (random >= cacheHigh) {
				highest = random;
				cacheHigh = random;		
			} else if (random <= cacheLow) {
				lowest = random;
				cacheLow = random;
			}
		}
		
		System.out.printf("Høyeste: %s Laveste: %s", highest, lowest);
		
	}
	
}