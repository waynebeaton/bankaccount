package bankaccount;

import java.math.BigDecimal;

public class BankAccount {

	private BigDecimal balance = BigDecimal.ZERO;

	public void deposit(BigDecimal value) {
		post(new Deposit(value));
	}
	
	public void withdraw(BigDecimal value) {
		post(new Withdrawal(value));
	}

	public void post(Transaction transaction) {
		transaction.postOn(this);
	}

	public BigDecimal getBalance() {
		return balance;
	}

	void credit(BigDecimal amount) {
		balance = balance.add(amount);
	}

	void debit(BigDecimal value) {
		balance = balance.subtract(value);
	}
}
