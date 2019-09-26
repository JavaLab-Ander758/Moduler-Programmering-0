import java.text.DecimalFormat;
import java.text.NumberFormat;

public class GjennomsnittligHastighet {

	public static void main(String[] args) {
		// 24 miles pr. 1t,40min,35sek. Finn gj.v.  1 miles = 1.6km
			double distance;
				distance = (24 * 1.6);
			double time;
				time = (1) + (40.0/60.0) + (35/(60*60));
			double speed;
				speed = distance/time;
			//Bruker "formatter.format(speed)" for å formatere desimallengden til 2 etter komme, #0.00
			NumberFormat formatter = new DecimalFormat("#0.00");
			
		System.out.println("Mosjonisten har en gj. hastighet på " + formatter.format(speed) + " km/h :)");		
	}

}