package it.unibs.eng.fp.bank;

public class BankAccount {
	private final String owner;
	private Long balance;

	public BankAccount(String owner, Long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public BankAccount(String owner) {
		this(owner, 0L);
	}

	public String getOwner() {
		return owner;
	}

	public Long getBalance() {
		return balance;
	}

	public void deposit(Long amount) {
		balance += amount;
	}

	public void withdraw(Long amount) {
		balance -= amount;
	}
}
