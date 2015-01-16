package com.jdit.core.dao.support.jdbc;

public abstract class AbstractCriterion implements Criterion {
	private boolean isPromoted;
	private String op;
	
	public Criterion promote() {
		this.isPromoted = true;
		return this;
	}
	
	public boolean isPromoted() {
		return isPromoted;
	}
	
	public void setPromoted(boolean isPromoted) {
		this.isPromoted = isPromoted;
	}
	
	public String getOp() {
		return op;
	}
	
	public void setOp(String op) {
		this.op = op;
	}
}