package src;

public class PrøveUtStringMetoder {

	public static void main(String[] args) {
		
		String exampleString = "Daniel er min favoritt studentassistent";
		String exampleStringUpperCase = exampleString.toUpperCase();
		
		System.out.printf("%s\n%s\n\n",exampleString, exampleStringUpperCase);
		
		System.out.println(exampleString == exampleStringUpperCase);
		// System.out.println(exampleString == exampleString);
		System.out.println(exampleString.equals(exampleStringUpperCase));
		System.out.println(exampleString.equalsIgnoreCase(exampleStringUpperCase));
	}

}