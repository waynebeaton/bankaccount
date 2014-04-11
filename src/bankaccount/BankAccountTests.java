package bankaccount;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class BankAccountTests {

	@Test
	public void testDeposit() {
		BankAccount account = new BankAccount();
		account.deposit(new BigDecimal(1000));
		assertEquals(new BigDecimal(1000), account.getBalance());
	}

	@Test
	public void testWithdraw() {
		BankAccount account = new BankAccount();
		account.deposit(new BigDecimal(1000));
		account.withdraw(new BigDecimal(100));
		assertEquals(new BigDecimal(900), account.getBalance());
	}
}
