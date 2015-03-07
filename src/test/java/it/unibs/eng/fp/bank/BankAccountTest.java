package it.unibs.eng.fp.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	private static final String OWNER = "Pietro Martinelli";

	@Test
	public void initializeOwnerAndBalance() throws Exception {
		final Long balance = 2000L;
		final BankAccount account = new BankAccount(OWNER, balance);
		assertAccount(account, OWNER, balance);
	}

	@Test
	public void initializeUsingDefaultInitialBalance() throws Exception {
		final BankAccount account = new BankAccount(OWNER);
		assertAccount(account, OWNER, 0L);
	}

	@Test
	public void depositABitOfMoney() throws Exception {
		final BankAccount account = new BankAccount(OWNER, 1500L);
		account.deposit(1000L);
		assertAccount(account, OWNER, 2500L);
	}

	@Test
	public void withrdawABitOfMoney() throws Exception {
		final BankAccount account = new BankAccount(OWNER, 1500L);
		account.withdraw(1000L);
		assertAccount(account, OWNER, 500L);
	}

	private void assertAccount(BankAccount account, String owner, Long balance) {
		assertEquals(owner, account.getOwner());
		assertEquals(balance, account.getBalance());
	}
}
