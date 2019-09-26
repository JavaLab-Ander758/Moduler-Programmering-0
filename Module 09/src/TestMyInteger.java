
public class TestMyInteger {

	public static void main(String[] args) {
		System.out.print("\nNumberOne = 5 \n");
		MyInteger numberOne = new MyInteger(5);
		System.out.printf("Er numberOne partall? %s \n", numberOne.isEven() ? "Ja" : "Nei");
		System.out.printf("Er numberOne primtall? %s \n", numberOne.isPrime() ? "ja" : "Nei");
		System.out.printf("Er 15 et primtall? %s \n", MyInteger.isPrime(15) ? "ja" : "Nei");
		System.out.printf("parseInt med array %s \n", MyInteger.parseInt(new char[] {'3', '5', '3', '9'}));
		System.out.printf("parseInt med string %s \n", MyInteger.parseInt("3539"));
		
		System.out.print("\nNumberTwo = 24 \n");
		MyInteger numberTwo = new MyInteger(24);
		System.out.printf("Er numberTwo oddetall? %s \n", numberTwo.isOdd() ? "ja" : "Nei");
		System.out.printf("Er 45 et oddetall? %s \n", MyInteger.isOdd(45) ? "ja" : "Nei");
		System.out.printf("Er numberOne lik numberTwo? %s \n", numberOne.equals(numberTwo) ? "ja" : "Nei");
		System.out.printf("Er numberOne lik 5? %s \n", numberOne.equals(5) ? "ja" : "Nei");
	}

}

class MyInteger{
	private int value;
	
	public MyInteger(int value){this.value = value;}
	
	public int getValue(){return value;}
	
	public Boolean isEven(){return (value % 2 == 0);}
	public Boolean isOdd(){return (value % 2 != 0);}
	public Boolean isPrime(){
		for (int divisor = 2; divisor <= value / 2; divisor++)
			if (value % divisor == 0)  // If true, number is not prime
				return false; // number is not a prime
		return true; // number is prime
	}
	
	public static Boolean isEven(int n){return (n % 2 == 0);}
	public static Boolean isOdd(int n){return (n % 1 == 0);}
	public static Boolean isPrime(int n){
		for (int divisor = 2; divisor <= n / 2; divisor++)
			if (n % divisor == 0)  // If true, number is not prime
				return false; // number is not a prime
		return true; // number is prime
	}
	
	public static Boolean isEven(MyInteger n){return isEven(n.getValue());}
	public static Boolean isOdd(MyInteger n){return isOdd(n.getValue());}
	public static Boolean isPrime(MyInteger n){return isPrime(n.getValue());}
	
	public Boolean equals(int n){return (n == this.getValue());}
	public Boolean equals(MyInteger n){return (this.getValue() == n.getValue());}
	
	public static int parseInt(char[] numbers){
		int digits = 0;
		for (int i = 0; i < numbers.length; i++) {
			digits = digits * 10 + (numbers[i] - '0');
		}
		return digits;
		
	}
	
	public static int parseInt(String textDigits) {
		int digits = 0;
		char[] testing = textDigits.toCharArray();
		
		for (int i = 0; i < textDigits.length(); i++)
			digits = digits * 10 + (testing[i] - '0');
		return digits;
	}
}