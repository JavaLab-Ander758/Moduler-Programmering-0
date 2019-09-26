
public abstract class Testing {

	public static void main(String[] args) {
		
		String test = "234";
		char[] testing = test.toCharArray();
		
		int digits = 0;
		for (int i = 0; i < test.length(); i++) {
			digits = digits * 10 + (testing[i] - '0');
		}
		System.out.println(digits);
		
	}
	
}
