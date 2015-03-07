package it.unibs.eng.fp.bank;

public class BankAccount {
	private final String owner;
	private Long balance;

	public BankAccount(String owner, Long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public Long getBalance() {
		return balance;
	}

}
