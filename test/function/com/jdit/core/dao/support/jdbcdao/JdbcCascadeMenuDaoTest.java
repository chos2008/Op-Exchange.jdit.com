package com.jdit.core.dao.support.jdbcdao;

import java.util.Map;

import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import com.jdit.common.CascadeMenu;

public class JdbcCascadeMenuDaoTest extends AbstractDependencyInjectionSpringContextTests {
	protected String[] getConfigLocations() {
		return new String[] {
			"com/jdit/core/dao/support/jdbcdao/applicationContext.xml"
		};
	}
	
	public void testFindById() {
		Map<String, Object> m = cascadeMenuDao.findById("1");
		System.out.println(m.toString());
	}
	
	public void testSave() {
		CascadeMenu menu = new CascadeMenu();
		menu.setName("报表与分析");
		cascadeMenuDao.save(menu);
	}
	
	public JdbcCascadeMenuDao getCascadeMenuDao() {
		return cascadeMenuDao;
	}
	
	public void setCascadeMenuDao(JdbcCascadeMenuDao cascadeMenuDao) {
		this.cascadeMenuDao = cascadeMenuDao;
	}
	
	private JdbcCascadeMenuDao cascadeMenuDao;

}