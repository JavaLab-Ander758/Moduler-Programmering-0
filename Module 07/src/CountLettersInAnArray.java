
public class CountLettersInAnArray {

	public static void main(String[] args) {

		// Lag en array med 100 tilfeldige bokstaver a-z 
		char[] chars = createArray();
		
		// Vis arrayen
		System.out.println("Bokstavene er:");
		displayArray(chars);
		
		// Count the occurrences
		int[] occurrence = countOccurrences(chars);
		for (int i = 0; i < occurrence.length; i++)
			System.out.printf("[%d]=%d, ", i, occurrence[i]);
		System.out.println();
		
		// Display the counted numbers
		System.out.println("\nBokstavene telt opp blir:");
		displayOccurrences(occurrence);

	}
	
	// Lag en tilfeldig array med 100 tilfeldige bokstaver a-z
	public static char[] createArray() {
		char[] chars = new char[100];
		// 'a' = 97, 'z' = 122
		for (int i = 0; i < chars.length; i++)
			chars[i] = (char) ((int)(Math.random() * (122 - 96) + 1) + 96);
		return chars;
	}
	
	// Display the array
	public static void displayArray(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			System.out.printf("%s ", chars[i]);
			if ((i + 1) % 20 == 0)
				System.out.print("\n");
		}
	}
	
	// Count the occurrences
	public static int[] countOccurrences(char[] chars) {
		char[] alphabet = new char[26];
		for (int i = 0; i < alphabet.length; i++)
			alphabet[i] = (char) (i + 'a');
		
		int[] counts = new int[26];
		for (int i = 0; i < chars.length; i++) {
			for(int j = 0; j < counts.length; j++)
				if (chars[j] == alphabet[j])
					counts[j]++;
		}
		return counts;
	}
	
	public static void displayOccurrences(int[] occurrence) {
		char start = 'a';
		for (int i = 0; i < occurrence.length; i++) {
			System.out.printf("%s %s ", start + i, occurrence[i]);
			
			if ((i + 1) % 20 == 0)
				System.out.print("\n");
		}
	}
	
	
	
}
