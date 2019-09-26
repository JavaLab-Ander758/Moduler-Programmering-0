
public class Oppgave2 {

	public static void main(String[] args) {
		
		System.out.printf("For 10 timer koster det %s \n\n", beregnAvgift(10));
		
		
	}
	
	static double beregnAvgift(int antallTimer) {
		double result = 40;
		if (antallTimer > 3)
			for (int i = 3; i < antallTimer; i++) {
				result += 10;
				if (result == 180)
					break;
			}
		return result;
		
	}
}
