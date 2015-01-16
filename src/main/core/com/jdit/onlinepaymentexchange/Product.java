package com.jdit.onlinepaymentexchange;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

public abstract class Product {
	protected Properties properties;
	protected Map<String, Collection<String>> propertyGroup;
	
	public Properties getPropertiesByGroup(String propertyGroup) {
		return null;
	}
	
	public Object getProperty(String property) {
		return null;
	}
	
	public void setProperty(String property, Object value) {
		
	}
	
	public void addProperty(String property, Object value) {
		
	}
	
	public void addProperties(Map<String, Object> properties) {
		
	}
}