package it.unibs.eng.fp.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	@Test
	public void initializeOwnerAndBalance() throws Exception {
		final String owner = "Pietro Martinelli";
		final Long balance = 2000L;
		final BankAccount account = new BankAccount(owner, balance);
		assertAccount(account, owner, balance);
	}

	@Test
	public void initializeUsingDefaultInitialBalance() throws Exception {
		final String owner = "Pietro Martinelli";
		final BankAccount account = new BankAccount(owner);
		assertAccount(account, owner, 0L);
	}

	private void assertAccount(BankAccount account, String owner, Long balance) {
		assertEquals(owner, account.getOwner());
		assertEquals(balance, account.getBalance());
	}
}
