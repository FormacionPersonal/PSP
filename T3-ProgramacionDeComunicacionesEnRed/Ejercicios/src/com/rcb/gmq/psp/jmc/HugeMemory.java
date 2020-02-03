package com.rcb.gmq.psp.jmc;

import java.math.BigDecimal;
import java.util.*;

public class HugeMemory {

	private Map<Integer, BigDecimal> map;
	
	private List<BigDecimal> list;
	
	private Set<BigDecimal> set;
	
	public HugeMemory(int size) {
		map = new HashMap(size);
		list = new ArrayList(size);
		set = new HashSet(size);
		for ( int i = 0; i < size; i++) {
			map.put(Integer.valueOf(i), new BigDecimal(i));
			//list.add(new BigDecimal(i));
			//set.add(new BigDecimal(i));
		}
		
	}

	
}
