
public class FirstClock {

	public static void main(String[] args) {
		
		int initialTime = (int) System.currentTimeMillis(), currentTime, seconds, minutes, hours;
		String clockOutput = "";
		
		while (true) {
			
			currentTime = (int) System.currentTimeMillis();
			
			seconds = ((currentTime - initialTime) / 1000) % 60;
			minutes = ((currentTime - initialTime) / 1000*60) % 60;
			hours = ((currentTime - initialTime) / 1000*60*60) % 24;
			
			System.out.printf("h: %s m: %s s: %s					\n", hours, minutes, seconds);
		}
		
	}
	
}