import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankingApp {



	public static void main(String[] args) {

		Bank myBank = new Bank();
		Scanner input = new Scanner(System.in);
		
		
		BankAccount myBankAccount = new BankAccount("1111", "Checking", 500.00);
		myBankAccount  = new BankAccount("2222", "Savings", 2500.00);
		
		Map<String, BankAccount> accounts = new HashMap<>();
		
//		accounts.put(1111);
		
		
		System.out.println("Welcome to YourBank. How can I help you today?");
		System.out.println("Press 1 to deposit");
		System.out.println("Press 2 to withdraw");
		System.out.println("Press 3 to check balance");
		System.out.println("Press 4 to close an account");
		System.out.println("Press -1 to exit");
		
		String userChoice = input.next();
		
		
		
		if (userChoice.equals("1")) {
			System.out.println("You want to deposit.");
			System.out.println("Here are your accounts:");
			System.out.println(accounts);
			System.out.println("To which one would you like to add a deposit?");
			
			
		} else {
			System.out.println("That was not a valid entry. Please choose again.");
			System.out.println("Press 1 to deposit");
			System.out.println("Press 2 to withdraw");
			System.out.println("Press 3 to check balance");
			System.out.println("Press 4 to close an account");
			System.out.println("Press -1 to exit");
			userChoice = input.next();
		}
		
		input.close();
	}

}
