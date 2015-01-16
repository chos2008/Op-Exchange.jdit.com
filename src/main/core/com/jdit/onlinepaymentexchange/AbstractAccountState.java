package com.jdit.onlinepaymentexchange;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class AbstractAccountState implements AccountState {
	protected static Log logger = LogFactory.getLog(AbstractAccountState.class);
	
	private int value;
	private AbstractAccountAction action;
	
	public AbstractAccountState(int state) {
		this.value = state;
	}
	
	public abstract void doInState(Account account);
	
	public AbstractAccountAction getAction() {
		return action;
	}
	
	public int getState() {
		return value;
	}
}