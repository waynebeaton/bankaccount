package bankaccount;

import java.math.BigDecimal;

public class Deposit extends Transaction {

	public Deposit(BigDecimal value) {
		super(value);
	}

	@Override
	void postOn(BankAccount account) {
		account.credit(amount);
	}
	

}
