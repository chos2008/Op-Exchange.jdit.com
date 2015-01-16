package com.jdit.onlinepaymentexchange;

import org.apache.commons.logging.LogFactory;

public class InitialState extends AbstractAccountState {
	
	static {
		logger = LogFactory.getLog(InitialState.class);
	}
	
	public InitialState() {
		super(2);
	}
	
	public void doInState(Account account) {
		logger.debug("Account working under initial state!");
		account.setState(this);
	}

	public void open() {
		
	}
	
	public void destroy() {
		
	}
}
