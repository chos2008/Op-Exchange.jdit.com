package com.jdit.core.dao.support.jdbcdao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.jdit.common.CascadeMenu;
import com.jdit.core.dao.CascadeMenuDao;

public class JdbcCascadeMenuDao extends JdbcDaoSupport implements CascadeMenuDao {

	public CascadeMenu findByObjectId(String OBJECTID) {
		// TODO Auto-generated method stub
		return null;
	}

	public CascadeMenu findByPath(String[] path) {
		return null;
	}

	public Map<String, Object> findById(String OBJECTID) {
		List list = this.getJdbcTemplate().queryForList("select * from CASCADE_MENU where OBJECTID=" + Integer.parseInt(OBJECTID));
		System.out.println("->" + list);
		if (list.size() == 1) {
//			return list.get(0);
			return (Map<String, Object>) list.get(0);
		}
		return null;
	}
	public void save(CascadeMenu menu) {
		Assert.assertNotNull(menu);
		StringBuilder sb = new StringBuilder("insert into CASCADE_MENU(NAME, PARENT) ")
			.append("values('" + menu.getName() + "', ");
		CascadeMenu parent = menu.getParent();
		if (parent == null) 
			sb.append("null");
		else 
			sb.append(parent.getOBJECTID());
		sb.append(")");
		this.getJdbcTemplate().execute(sb.toString());
	}

	public CascadeMenu findByPath(String path) {
		return null;
	}
	
	public CascadeMenu findByPath(List<String> path) {
		return null;
	}
}