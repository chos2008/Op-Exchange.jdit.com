package com.jdit.opp;

import com.jdit.onlinepaymentexchange.Account;
import com.jdit.onlinepaymentexchange.ActiveState;
import com.jdit.onlinepaymentexchange.FrozenState;
import com.jdit.onlinepaymentexchange.LossState;

import junit.framework.TestCase;

public class AccountTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	public void testAccount() {
		Account account = new Account();
		account.doInState();
		
		account.setState(new ActiveState());
		account.doInState();
		
		account.setState(new LossState());
		account.doInState();
		
		account.setState(new FrozenState());
		account.doInState();
	}
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
}
