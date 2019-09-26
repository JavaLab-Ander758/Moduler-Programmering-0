import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestAccount {

	public static void main(String[] args) {
		/** Opprettelse av konto */
		Account myAccount = new Account(1122, 2000);
		
		// myAccount.withdraw( x )
		int uttak = 2500;
		System.out.printf("Uttak av %d fra kontoen, status: %s \n", uttak, myAccount.withdraw(uttak) ? "suksess" : "feilet");
		
		// myAccount.deposit( x )
		int innskudd = 3000;
		System.out.printf("Setter inn %d til kontoen, status: %s \n", innskudd, myAccount.deposit(innskudd) ? "suksess" : "feilet");
		
		// myAccount.getBalance()
		System.out.printf("Saldoen er: %.2f kroner \n", myAccount.getBalance());
		
		// myAccount.setAnnualInterestRate( x )
		myAccount.setAnnualInterestRate(4.5);
		System.out.printf("Månedlig rente er: %.2f \n", myAccount.getMonthlyInterest());
		
		// myAccount.getDateCreated()
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		System.out.printf("Kontoen ble opprettet: %s", dateFormat.format(myAccount.getDateCreated().getTime()));
		//System.out.printf("Kontoen ble opprettet: %d-%d-%d %d:%d:%d", myAccount.getDateCreated().get(Calendar.YEAR), myAccount.getDateCreated().get(Calendar.MONTH), myAccount.getDateCreated().get(Calendar.DATE), myAccount.getDateCreated().get(Calendar.HOUR_OF_DAY), myAccount.getDateCreated().get(Calendar.MINUTE), myAccount.getDateCreated().get(Calendar.SECOND));
	}
}

class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Calendar dateCreated = Calendar.getInstance();
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Calendar getDateCreated() {
		return dateCreated;
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	public double getMonthlyInterest() {
		return balance * (annualInterestRate / 1200);
	}
	
	public boolean withdraw(double amount) {
		if (amount > balance)
			return false;
		else
			balance -= amount;
		return true;
	}
	
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}
		return false;
	}
	
}