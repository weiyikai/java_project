package com.wyklovelf.com.set110;

import java.util.HashMap;

/**
 * �Զ���Set
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
		map.put(obj, this.PRESENT);//set�����ظ��ı�����map�еļ������ظ���ԭ��
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
