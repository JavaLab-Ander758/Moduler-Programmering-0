import java.util.Random;
import java.util.Scanner;

public class CountRandomNumbers {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
 
		int computeChoise, numbersOfValues, maxValue, minValue, counter=0, totalValue=0, median;
		System.out.println(" - Programmer genererer tilfeldige tall og viser statistikk over disse -\n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Hvor mange tilfeldige siffer vil du ha?: ");
			numbersOfValues = input.nextInt();
		System.out.print("Hva vil du ha som maks verdi på sifrene?: ");
			maxValue = input.nextInt();
		System.out.print("Hva vil du ha som minimums verdi på sifrene?: ");
			minValue = input.nextInt();
		Random rand = new Random();
				
		while(true) {
			computeChoise = rand.nextInt((maxValue+1) + minValue);
			totalValue += computeChoise; 
			counter++;
			System.out.println(computeChoise);
			if (counter > numbersOfValues) {
				System.out.println("------------------------------ \n");
				counter -= counter;
				System.out.println("Du har nå telt til " + counter);
				System.out.println("Alle disse  sifrene summert er " + totalValue);
				
				median = totalValue/counter;
				System.out.println("Gjennomsnittet av de tilfeldige sifrene blir da " + median);
				break;
			}
		}
		
	}

}