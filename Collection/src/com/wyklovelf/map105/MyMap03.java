package com.wyklovelf.map105;

import java.util.LinkedList;

/**
 * 对MyMap中哈希码重复导致MyEntry条目对象被覆盖的问题
 * 	MyLinkedList []arr = new MyLinkedList[999];//Map的底层结构就是：数组+链表
 * @author weiyikai
 *
 */
public class MyMap03 {
	
	
	LinkedList []arr = new LinkedList[999];//Map的底层结构就是：数组+链表
	
	int size;
	
	public void put(Object key,Object value) {
		MyEntry e = new MyEntry(key,value);
	
		int hash = e.hashCode();//hashCode()可能返回负数。
		
		hash = hash < 0 ? -hash:hash;
		
		int a = hash%arr.length;
		
		if(null == arr[a]) {
			LinkedList list = new LinkedList();
			
			list.add(e);
			
			arr[a] = list;
		}else {
			
			LinkedList list = arr[a];
			
			for (int i = 0; i < list.size(); i++) {
				MyEntry e2 = (MyEntry)list.get(i);
				
				if(e2.key.equals(key)) {
					e2.value = value;//键值重复直接覆盖
					return;
				}
			}
			
		 	arr[a].add(e);
		}
	}
	
	
	/*
	 * 如果新增的条目中的key和LinkedList中的某一个元素（条目对象）的key相等，则用新的条目覆盖旧的条目。
	 */
	public Object get(Object key) {
		int a = key.hashCode() % arr.length;
		
		if(null != arr[a]) {
			LinkedList list = arr[a];
			
			for (int i = 0; i < list.size(); i++) {
				
				MyEntry e = (MyEntry)list.get(i);
				
				if(e.key.equals(key)) {
					return e.value; 
				}
			}
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		MyMap03 m3 = new MyMap03();
		
		m3.put("高琪", new Wife("杨幂"));
		
		m3.put("高琪", new Wife("张曼玉"));
		
		Wife w = (Wife)m3.get("高琪");
		
		System.out.println(w.name);
	}
}
