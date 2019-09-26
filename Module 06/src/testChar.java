
public class testChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		String test = "123ABCabc";
		
		for (int i = 0; i < test.length(); i++) {
			x = (int)test.charAt(i);
			System.out.printf("Bokstaven: %s er har dec-verdi: %s  \n", test.charAt(i), x);
		}
		
		
		
	}

}
