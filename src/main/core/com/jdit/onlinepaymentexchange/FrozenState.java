package com.jdit.onlinepaymentexchange;

import org.apache.commons.logging.LogFactory;

public class FrozenState extends AbstractAccountState {
	static {
		logger = LogFactory.getLog(FrozenState.class);
	}
	
	public FrozenState() {
		super(2);
	}
	
	public void doInState(Account account) {
		logger.debug("Account working under frozen state!");
		account.setState(this);
	}

}
