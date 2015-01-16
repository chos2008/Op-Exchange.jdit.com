package com.jdit.core.dao.support.jdbcdao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.jdit.core.dao.GenericDataAccessor;

public class GenericPersistentManager extends JdbcDaoSupport implements GenericDataAccessor {
	private String tableName;
	public void delete(Object obj) {
		this.getJdbcTemplate().execute("delete from " + tableName);
	}

	public void save(Object obj) {
		// TODO Auto-generated method stub
		
	}

	public void update(Object obj) {
		// TODO Auto-generated method stub
		
	}
	
}
