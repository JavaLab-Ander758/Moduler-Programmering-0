import java.util.Scanner;

public class SteinSaksPapir_ObligatoriskGruppeoppgave {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// Stein, saks, papir
		
		int stein=0, saks=1, papir=2, userChoise, computeChoise;
		//String steinString = "Stein", saksString = "saks", papirString = "papir";
		Scanner input = new Scanner(System.in);
		
		// Oppretter en while(true) loop for at brukeren skal kunne spille gjentatte ganger
		while(true) {
			//Oppretter random generator
			computeChoise = 0 + (int)(Math.random() * (3)); // Starter på 0, totalt 3 mulige. <0,2>
			
			System.out.print("Stein (0), Saks (1), Papir(2)?: ");
			userChoise = input.nextInt();
			
			if (userChoise == stein) {
				if(computeChoise == stein) {
					System.out.println("Datamaskinen er stein. Du er stein. Uavgjort...");
				} else if (computeChoise == saks) {
					System.out.println("Datamaskinen er saks. Du er stein. Du har vunnet!");
				} else if (computeChoise == papir) {
					System.out.println("Datamaskinen er papir. Du er stein. Du tapte!");
				}
			} else if (userChoise == saks) {
				if(computeChoise == stein) {
					System.out.println("Datamaskinen er stein. Du er saks. Du tapte!");
				} else if (computeChoise == saks) {
					System.out.println("Datamaskinen er saks. Du er saks. Uavgjort...");
				} else if (computeChoise == papir) {
					System.out.println("Datamaskinen er papir. Du er saks. Du vunnet!");
				}
			} else if (userChoise == papir) {
				if(computeChoise == stein) {
					System.out.println("Datamaskinen er stein. Du er papir. Du har vunnet!");
				} else if (computeChoise == saks) {
					System.out.println("Datamaskinen er saks. Du er papir. Du tapte");
				} else if (computeChoise == papir) {
					System.out.println("Datamaskinen er papir. Du er papir. Uavgjort...");
				}
			} else if (userChoise > 2 || userChoise < 0) {
				System.out.println("Ugyldig tall, kun 0, 1 eller 2 aksepteres. Prøv på nytt!"); 
			}
			System.out.println("-----------------------------\n\n");
		}
	}

}