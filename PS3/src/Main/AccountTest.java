package Main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	Account test;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		test = new Account(1112, 20000);
		test.setAnnualInterestRate(.045);
	}

	@After
	public void tearDown() throws Exception {
		test = null;
	}

	@Test
	public final void testWithdraw() throws InsufficientFundsException {
		test.withdraw(2500);
		assertEquals("Withdrawing $2500 from the account leaves a balance of $17500", (double) 17500,
				(double) test.getBalance(), .001);
	}

	public final void testDeposit() {
		test.deposit(3000);
		assertEquals("Depositing $3000 to the account leaves a balance of $23000", (double) 23000,
				(double) test.getBalance(), .001);
	}
	
	public final void testPrint(){
		System.out.print("Balance: $" + test.getBalance());
		System.out.print("Monthly Interest Rate: " + test.getMonthlyInterestRate() + "%");
		System.out.print("Account created on: " + test.getDateCreated());
		assertEquals("Balance: $20000", "Balance: $" + test.getBalance());
		assertEquals("Monthly Interest Rate: .375%", "Monthly Interest Rate: " + test.getMonthlyInterestRate() + "%");
		assertEquals("Account created on:" + test.getDateCreated(),
				"Account created on: " + test.getDateCreated());
	}
	
	
}
