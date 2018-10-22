package com.wyklovelf.map105;

import com.wyklovelf.linkedlist103.MyLinkedList;

/**
 * 提高了查询效率的MyMap
 * 
 * @author weiyikai
 *Map底层：数组+链表
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
		return m2[key.hashCode()%999]; //返回键key对应的哈希码里面的值,缺点：
	}
	
	public static void main(String[] args) {
		
	}
}
