
public class Listing2_7ShowCurrentTime {

	public static void main(String[] args) {
		// 
		int counter = 0;
		
		while(true) {
			@SuppressWarnings("unused")
			long totalMilliseconds = System.currentTimeMillis();
			
			long totalSeconds = System.currentTimeMillis() / 1000;
			
			long currentSeconds = totalSeconds % 60;
			
			long totalMinutes = totalSeconds / 60;
			
			long currentMinute = totalMinutes % 60;
			
			long totalHours = totalMinutes / 60;
			
			long currentHour = totalHours % 24;
			
			System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSeconds + " GMT" + "		counter is at: " + counter);
			counter++;
			
			if (counter > 1000) {
				counter--;
				System.out.println();
				System.out.print("- Finished counting to " + counter);
				
				break;
			}
		}
		
		
		//System.out.printf("Current time is %f : %f : %f GMT", currentHour, currentMinute, currentSeconds);

	}

}
