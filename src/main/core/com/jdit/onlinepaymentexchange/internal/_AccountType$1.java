package com.jdit.onlinepaymentexchange.internal;

import java.util.HashMap;
import java.util.Map;

import com.jdit.onlinepaymentexchange.AccountType$1;

public class _AccountType$1 implements AccountType$1 {

	public int[] getAllAccountLevel() {
		return ACCOUNT_LEVEL_INDEX;
	}

	public int[] getAllAccountType() {
		return ACCOUNT_TYPE_INDEX;
	}

	public Map<Integer, String> map() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < ACCOUNT_TYPE_INDEX.length; i++) {
			for (int j = 0; j < ACCOUNT_LEVEL_INDEX.length; j++) {
				int k = ACCOUNT_TYPE_INDEX[i] + ACCOUNT_LEVEL_INDEX[j];
				String s = ACCOUNT_LEVEL_NAME_INDEX[j] + ACCOUNT_TYPE_NAME_INDEX[i];
				map.put(k, s);
			}
		}
		return map;
	}
	
	public Map<Integer, String> getAllAccountTypeMap() {
		return ACCOUNT_TYPE_NAME_MAP;
	}
	
	public Map<Integer, String> getAllAccountLevelMap() {
		return ACCOUNT_LEVEL_NAME_MAP;
	}
	
	public String getAccountType(int index) {
		Map<Integer, String> map = map();
		String s = map.get(index);
		if (s == null) 
			return "δ֪�ʻ�";
		return s;
	}
	
	private static final int ACCOUNT_TYPE_INDEX[] = new int[] {PERSONAL, GROUP, INTERNATIONAL};
	private static final String ACCOUNT_TYPE_NAME_INDEX[] = new String[] {
		PERSONAL_NAME, GROUP_NAME, INTERNATIONAL_NAME
	};
	private static final Map<Integer, String> ACCOUNT_TYPE_NAME_MAP;
	
	private static final int ACCOUNT_LEVEL_INDEX[] = new int[] {NORMAL, GOLD, PLATINUM, DIAMOND};
	private static final String[] ACCOUNT_LEVEL_NAME_INDEX = new String[] {
		NORMAL_NAME, GOLD_NAME, PLATINUM_NAME, DIAMOND_NAME
	};
	private static final Map<Integer, String> ACCOUNT_LEVEL_NAME_MAP;
	static 
	{
		ACCOUNT_TYPE_NAME_MAP = new HashMap<Integer, String>();
		if (ACCOUNT_TYPE_NAME_INDEX.length < ACCOUNT_TYPE_INDEX.length) 
			throw new RuntimeException();
		for (int i = 0; i < ACCOUNT_TYPE_INDEX.length; i++) {
			ACCOUNT_TYPE_NAME_MAP.put(ACCOUNT_TYPE_INDEX[i], ACCOUNT_TYPE_NAME_INDEX[i]);
		}
		ACCOUNT_LEVEL_NAME_MAP = new HashMap<Integer, String>();
		if (ACCOUNT_LEVEL_NAME_INDEX.length < ACCOUNT_LEVEL_INDEX.length) 
			throw new RuntimeException();
		for (int i = 0; i < ACCOUNT_LEVEL_INDEX.length; i++) {
			ACCOUNT_LEVEL_NAME_MAP.put(ACCOUNT_LEVEL_INDEX[i], ACCOUNT_LEVEL_NAME_INDEX[i]);
		}
	}
}
