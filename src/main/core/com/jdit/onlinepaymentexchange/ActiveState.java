package com.jdit.onlinepaymentexchange;

import org.apache.commons.logging.LogFactory;

public class ActiveState extends AbstractAccountState {
	static {
		logger = LogFactory.getLog(ActiveState.class);
	}

	public ActiveState() {
		super(2);
	}
	
	public void doInState(Account account) {
		logger.debug("Account working under active state!");
		account.setState(this);
	}

}
