package com.wyklovelf.map105;

import com.wyklovelf.linkedlist103.MyLinkedList;

/**
 * ����˲�ѯЧ�ʵ�MyMap
 * 
 * @author weiyikai
 *Map�ײ㣺����+����
 */
public class MyMap02 {
	MyEntry []m2 = new MyEntry[999];
	
	int size;
	
	
	public void put(Object key,Object value) {
		MyEntry e = new MyEntry(key,value);
		
		int a = key.hashCode();
		
		m2[a] = e;
		
		size++;
	}
	
	public Object get(Object key) {
		return m2[key.hashCode()%999]; //���ؼ�key��Ӧ�Ĺ�ϣ�������ֵ,ȱ�㣺
	}
	
	public static void main(String[] args) {
		
	}
}
