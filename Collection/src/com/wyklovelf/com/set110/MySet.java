package com.wyklovelf.com.set110;

import java.util.HashMap;

/**
 * 自定义Set
 * @author weiyikai
 *
 */
public class MySet {
	
	HashMap map;
	
	private static final Object PRESENT = new Object();
	
	public MySet() {
		map = new HashMap();
	}
	
	public void add(Object obj) {
		map.put(obj, this.PRESENT);//set不可重复的本质是map中的键不可重复的原理
	}
	
//	public void remove(Object o) {
//		
//	}
	
	public int size() {
		return map.size();
	}
	
	public static void main(String[] args) {
		MySet s = new MySet();
		
		s.add("aaa");
		
		s.add(new String("aaa"));
		
		System.out.println(s.size());
	}
}
