package com.jdit.onlinepaymentexchange;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public interface AccountState {
//	public Log getLog();
	public void doInState(Account account);
	public int getState();
	public AbstractAccountAction getAction();
}
