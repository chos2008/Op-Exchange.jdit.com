package com.jdit.onlinepaymentexchange;

import org.apache.commons.logging.LogFactory;

public class LossState extends AbstractAccountState {
	
	static {
		logger = LogFactory.getLog(LossState.class);
	}
	
	public LossState() {
		super(2);
	}
	
	public void doInState(Account account) {
		logger.debug("Account working under loss state!");
		account.setState(this);
	}

	
}
