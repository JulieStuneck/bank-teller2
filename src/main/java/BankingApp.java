
import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {

		Bank myBank = new Bank();
		Scanner input = new Scanner(System.in);

		BankAccount account1 = new BankAccount("1111", "Checking", 500.00);
		BankAccount account2 = new BankAccount("2222", "Savings", 2500.00);

		myBank.add(account1);
		myBank.add(account2);

		System.out.println("Welcome to YourBank.");

		System.out.println("How can I help you today?");
		System.out.println("Press 1 to deposit");
		System.out.println("Press 2 to withdraw");
		System.out.println("Press 3 to check balance");
		System.out.println("Press 4 to close an account");
		System.out.println("Press 5 to exit");

		String userChoice = input.next();

		do {

			if (userChoice.equals("1")) {
				System.out.println("You want to deposit.");
				System.out.println("Here are your accounts:");
				myBank.showAccounts();
				System.out.println("To which one would you like to add a deposit?");
				String accountNum = input.next();
				System.out.println("How much would you like to deposit to account #" + accountNum + "?");
				int deptAmt = input.nextInt();
				myBank.deposit(accountNum, deptAmt);
				System.out.println("Your current balance is: " + myBank.findAccount(accountNum).getBalance());

			} else if (userChoice.equals("2")) {
				System.out.println("You want to make a withdrawal.");
				System.out.println("Here are your accounts:");
				myBank.showAccounts();
				System.out.println("From which one would you like to withdraw?");
				String accountNum = input.next();
				System.out.println("How much would you like to withdraw from account #" + accountNum + "?");
				int withdrawAmt = input.nextInt();
				myBank.withdraw(accountNum, withdrawAmt);
				System.out.println("Your current balance is: " + myBank.findAccount(accountNum).getBalance());

			} else if (userChoice.equals("3")) {
				System.out.println("The current balance of your accounts is:");
				myBank.showAccounts();

			} else if (userChoice.equals("4")) {
				System.out.println("Which account do you wish to close?");
				String closeChoice = input.next();
				myBank.close(myBank.findAccount(closeChoice));
				System.out.println("Your current accounts with us are:");
				myBank.showAccounts();

			}

		} while (!userChoice.equals("5"));
		System.out.println("Thanks for banking with us.");

		input.close();
	}

}
