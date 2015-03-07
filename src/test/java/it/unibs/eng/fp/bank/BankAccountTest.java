package it.unibs.eng.fp.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	@Test
	public void initializeOwnerAndBalance() throws Exception {
		final String owner = "Pietro Martinelli";
		final Long balance = 2000L;
		final BankAccount account = new BankAccount(owner, balance);
		assertEquals(owner, account.getOwner());
		assertEquals(balance, account.getBalance());
	}
}
