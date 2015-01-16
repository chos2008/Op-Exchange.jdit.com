package com.jdit.onlinepaymentexchange;

import org.apache.commons.logging.LogFactory;

public class ActivatedState extends AbstractAccountState {
	static {
		logger = LogFactory.getLog(ActivatedState.class);
	}
	
	public ActivatedState() {
		super(2);
	}
	
	public void doInState(Account account) {
		logger.debug("Account working under activated state!");
		account.setState(this);
	}

	public void destroy() {
		
	}
}
