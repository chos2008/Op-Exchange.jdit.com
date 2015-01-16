package com.jdit.onlinepaymentexchange;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class AbstractAccountAction {
	protected static Log logger = LogFactory.getLog(AbstractAccountAction.class);
	public abstract void doAction();
}