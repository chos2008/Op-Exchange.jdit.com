package com.jdit.core.dao;

import com.jdit.common.CascadeMenu;

public interface CascadeMenuDao {
	public void save(CascadeMenu menu);
	public CascadeMenu findByObjectId(String OBJECTID);
	public CascadeMenu findByPath(String[] path);
}
