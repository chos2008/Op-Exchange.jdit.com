package com.jdit.onlinepaymentexchange;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Account {
	protected static Log logger = LogFactory.getLog(Account.class);
	
	private AccountState state;
	
	public Account() {
		state = new InitialState();
	}
	
	public AccountState getState() {
		return state;
	}
	
	public void setState(AccountState state) {
		this.state = state;
	}
	
	public void doInState() {
		state.doInState(this);
	}
}
