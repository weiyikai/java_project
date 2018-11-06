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
	
		int hash = e.key.hashCode();//hashCode()可能返回负数。
		
		hash = hash < 0 ? -hash:hash;
		
		int a = hash%arr.length;
		
		if(null == arr[a]) {//arr[a]处的链表为空,需要在此处新建一个链表，并放入e条目。
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
			
		 	arr[a].add(e);//键不重复则在arr[a]处的链表中直接放入e条目即可
		}
		size++;
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
		
//		//hashCode相等，其内容不一定相同。但内容相等，hashCode一定相等
//		
//		MyEntry e1 = new MyEntry("高琪","杨幂");
//		
//		MyEntry e2 = new MyEntry("高琪","张曼玉");
//		
//		System.out.println(e1.key.hashCode()%999);
//		
//		System.out.println(e2.key.hashCode()%999);
		
		MyMap03 m3 = new MyMap03();
		
		m3.put(1, new Wife("杨幂"));
		
		m3.put(1, new Wife("张曼玉"));
		
		Wife w = (Wife)m3.get(1);
		
		System.out.println(w.name);
	}
}
