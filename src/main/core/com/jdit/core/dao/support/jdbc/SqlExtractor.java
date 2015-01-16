package com.jdit.core.dao.support.jdbc;

import java.util.ArrayList;
import java.util.List;

public class SqlExtractor {
	private String op;
	private String tableName;
	private List<String> columns;
//	DetachedCriteria criteria = DetachedCriteria.forClass(SqlExtractor.class).add(Restrictions.eq("", ""));
	
	private Criteria criteria;
	protected SqlExtractor(String tableName) {
		this.tableName = tableName;
	}
	public static SqlExtractor forTable(String table) {
		return new SqlExtractor(table);
	}
	
	public SqlExtractor addOp(int op) {
		switch (op) {
		case SqlOperation.INSERT: 
			this.op = "insert";
			break;
		case SqlOperation.DELETE: 
			this.op = "delete";
			break;
		case SqlOperation.UPDATE: 
			this.op = "update";
			break;
		case SqlOperation.SELECT: 
			this.op = "select";
		}
		return this;
	}
	public SqlExtractor addColumn(List<String> columns) {
		this.columns = columns;
		return this;
	}
	
	public SqlExtractor addColumn(String column) {
		if (columns == null) 
			columns = new ArrayList<String>();
		columns.add(column);
		return this;
	}
	
	public SqlExtractor addCriteria(Criteria criteria) {
		return this;
	}
}
