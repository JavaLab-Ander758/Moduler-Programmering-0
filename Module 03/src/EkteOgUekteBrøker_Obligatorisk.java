import java.util.Scanner;

public class EkteOgUekteBrøker_Obligatorisk {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double teller, nevner;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Oppgi teller: ");
		teller = input.nextDouble();
		System.out.print("Oppgi nevner: ");
		nevner = input.nextDouble();
		System.out.println();
		
		if (teller < nevner) {
			System.out.println(teller + " / " + nevner + " er en ekte brøk");
		} else if (teller % nevner == 0) {
			System.out.println(teller + " / " + nevner + " er en uekte brøk");
			System.out.println("Den kan reduseres til " + teller / nevner + ".");
		} else if (teller % nevner != 0) {
			System.out.println(teller + " / " + nevner + " er en uekte brøk");
			
			// Oppretter ny teller og nevner for det blandede tallet for å få formen i eksempelet, 16/3 = 5.333 blir -> 5 og 1/3 
			double resultat = teller / nevner, blandetTeller = teller % nevner, blandetNevner = teller / resultat;
			System.out.printf("Det er et blandet tall: %.0f + %.2f / %.2f", Math.floor(resultat), blandetTeller, blandetNevner);
		}
		
	}
}