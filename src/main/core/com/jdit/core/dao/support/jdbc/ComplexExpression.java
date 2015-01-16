package com.jdit.core.dao.support.jdbc;

public class ComplexExpression extends AbstractCriterion {
	private Criterion criterion1;
	private Criterion criterion2;
	
	protected ComplexExpression(Criterion criterion1, Criterion criterion2, String op) {
		this.criterion1 = criterion1;
		this.criterion2 = criterion2;
		setOp(op);
	}
}