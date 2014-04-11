package bankaccount;

import java.math.BigDecimal;

public class Withdrawal extends Transaction {

	public Withdrawal(BigDecimal amount) {
		super(amount);
	}

	@Override
	void postOn(BankAccount account) {
		account.debit(amount);
	}
}
