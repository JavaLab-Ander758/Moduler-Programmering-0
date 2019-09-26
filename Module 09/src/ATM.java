import java.util.Calendar;
import java.util.Scanner;

public class ATM {
	static Scanner input = new Scanner(System.in);
	static int id;
	static Account[] accounts = new Account[10];
	
	
	public static void main(String[] args) {
		// Fill accounts
		for (int i = 0; i < accounts.length; i++)
			accounts[i] = new Account(i, 1000);
		
		// Execute ATM
		while (true) {
			askForId();
			
			boolean proceed = true;
			while (proceed == true) {
				int choice = getChoice();
				switch (choice) {
					case 1:
						printBalance(id); break;
					case 2:
						withdraw(id); break;
					case 3:
						deposit(id); break;
					case 4:
						proceed = false;
				}
			}
		}
		
	}
	private static void askForId() {
		while (true) {
			System.out.print("\n__________________ \nOppgi en konto id: ");
			id = input.nextInt() - 1;
			if (id >= 0 && id <= 9)
				break;
			else
				System.out.println("Oppgi id mellom 1 og 10.");
		}
	}
	
	private static int getChoice() {
		while (true) {
		System.out.printf("\n- - - - - - \nKonto nr. %d \nMeny \n 1: Saldo \n 2: Uttak \n 3: Innskudd \n 4: Avbryt \nDitt valg?: ", id + 1);
		int choice = input.nextInt();
		if (choice >= 1 && choice <= 4)
			return choice;
		else
			System.out.println("Skriv tall fra 1-4 !");
		}
		
	}
	
	private static void printBalance(int id) {
		System.out.printf("\nSaldo for konto nr %d er %.2f kr \n", id + 1, accounts[id].getBalance());
	}
	
	private static void withdraw(int id) {
			System.out.print("Oppgi uttaksverdi: ");
			double amount = input.nextInt();
			if (amount <= accounts[id].getBalance() && amount >= 0) {
				accounts[id].withdraw(amount);
			} else
				System.out.print("Error: Insuffiecient balance! \n");
	}
	
	private static void deposit(int id) {
		System.out.print("Oppgi innskuddsverdi: ");
		double amount = input.nextInt();
		if (amount >= 0)
			accounts[id].deposit(amount);
		else
			System.out.println("Ugydlig operasjon!");
			
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