
public class UseStopWatch {

	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch();
		int primes = 30000;
		
		stopWatch.start();
		for (int i = 0; i < primes; i++)
			isPrimeBad(i);
		stopWatch.end();
		System.out.printf("Tid for å finne %s primtall med isPrimeBad er %s nanosekunder", primes, stopWatch.getElapsedTime());
		
		stopWatch.start();
		for (int i = 0; i < primes; i++)
			isPrimeGood(i);
		stopWatch.end();
		System.out.printf("\nTid for å finne %s primtall med isPrimeGood er %s nanosekunder", primes, stopWatch.getElapsedTime());
		
	}
	
	public static boolean isPrimeBad(long number) {
		for (int divisor = 2; divisor <= number / 2; divisor++)
			if (number % divisor == 0)  // If true, number is not prime
				return false; // number is not a prime
		return true; // number is prime
	}
	public static boolean isPrimeGood(long number) {
		// Kun delelig med seg selv eller 1
		if ((number > 1) && (number % 2 != 0))
			return false;
		int maxCheck = (int)Math.sqrt(number);
		for (int divisor = 3; divisor <= maxCheck; divisor += 2)if (number % divisor == 0)
			return false;
		return true;
	}
}

class StopWatch{
	
	private long startTime, endTime;
	
	public void start() {
		startTime = System.nanoTime();
	}
	public void end() {
		endTime = System.nanoTime();
	}
	public long getElapsedTime() {
		return endTime - startTime;
	}
}