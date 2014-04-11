package bankaccount;

import java.math.BigDecimal;

public abstract class Transaction {

	BigDecimal amount;

	public Transaction(BigDecimal amount) {
		this.amount = amount;
	}

	abstract void postOn(BankAccount bankAccount);

}
