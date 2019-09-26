
public class TestProgramWithArrays {

	public static void main(String[] args) {
		// 
		
		int[] values = new int[5];
		
		for (int i = 1; i < 5; i++) {
			values[i] = i + values[i-1];
		}
		values[0] = values[1] + values[4];
		
		for (int i = 0; i < values.length; i++) {
			System.out.printf("Values[%d] = %s \n", i, values[i]);
		}
		
		// Setter alle lik 0
		for (int i = 0; i < values.length; i++)
			values[i] = 0;
		
		System.out.println("\nTilfeldige tall mallom 0 - 100:");
		//generer tilfeldige mellom 0 - 100
		for (int i = 0; i < values.length; i++) {
			values[i] = (int) (Math.random() * 100);
			System.out.printf("Values[%d] = %d \n", i, values[i]);
		}
	}

}
