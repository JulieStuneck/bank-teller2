
public class BankAccount {
	
	private String accountNumber;
	private String type;
	private double balance;

	public String getAccountNumber() {

		return accountNumber;
	}
	
	public String getType() {
		
		return type;
	}

	public double getBalance() {

		return balance;
	}

	public BankAccount(String accountNumber, String type, double balance) {
		this.accountNumber = accountNumber;
		this.type = type;
		this.balance = balance;
	}

	public void withdraw(int amount) {

		balance -= amount;

	}

	public void deposit(int amount) {

		balance += amount;
		
	}

}
