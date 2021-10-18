package com.todo.config1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

	@Test
	public void testDeposit() throws Exception {
		Bank bank = new Bank("Michel", "Mao",null, 200.00);
		double balance = bank.deposit(200, true);
		assertEquals(400.00, balance,0);
		
	}

	@Test
	public void testWithdraw() {
		Bank bank = new Bank("Michel", "Mao",null, 200.00);
		double balance = bank.withdraw(200, true);
		assertEquals(0, balance,0);
	}

	@Test
	public void testGetBalance() {
		Bank bank = new Bank("Michel", "Mao",null, 200.00);
		double balance = bank.withdraw(200, true);
		assertEquals(0, balance,0);
	}
	
}
