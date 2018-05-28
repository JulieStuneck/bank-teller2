import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class BankTest {

	Bank underTest;
	BankAccount account1;
	BankAccount account2;

	@Before
	public void setUp() {
		underTest = new Bank();
		account1 = new BankAccount("1", "Checking", 100);
		account2 = new BankAccount("2", "Savings", 100);
	}

	@Test
	public void shouldBeAbleToAddAccount() {
		underTest.add(account1);
		BankAccount retrievedAccount = underTest.findAccount("1");
		assertThat(retrievedAccount, is(account1));
	}

	@Test
	public void shouldBeAbleToAddTwoAccounts() {
		underTest.add(account1);
		underTest.add(account2);
		Collection<BankAccount> allAccounts = underTest.getAllAccounts();
		assertThat(allAccounts, contains(account1, account2));
	}

}
