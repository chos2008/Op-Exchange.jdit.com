package com.jdit.core.dao.support.jdbc;

public class Expression extends AbstractCriterion {
	protected Expression(String colName, Object value, String op) {
		col = colName;
		this.value = value;
		setOp(op);
	}
	private String col;
	private Object value;
}