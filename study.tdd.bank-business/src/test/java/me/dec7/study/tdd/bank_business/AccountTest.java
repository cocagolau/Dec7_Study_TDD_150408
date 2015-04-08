package me.dec7.study.tdd.bank_business;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	private Account account;

	@Before
	public void setup() {
		account = new Account(10000);
	}

	@Test
	public void getBalance() throws Exception {
		assertEquals("10000원으로 계좌 생성후 잔고 조회", 10000, account.getBalance());
		
		account = new Account(1000);
		assertEquals("1000원으로 계좌 생성후 잔고 조회", 1000, account.getBalance());
		
		account = new Account(0);
		assertEquals("0원으로 계좌 생성후 잔고 조회", 0, account.getBalance());
	}
	
	@Test
	public void deposit() throws Exception {
		account.deposit(1000);
		
		assertEquals("10000원을 가진 계좌에서 1000원을 입금 후 조회", 11000, account.getBalance());
	}
	
	@Test
	public void withdraw() throws Exception {
		account.withdraw(1000);
		
		assertEquals("10000원을 가진 계좌에서 1000원을 출금 후 조회", 9000, account.getBalance());
	}

}
