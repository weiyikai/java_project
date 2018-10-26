package com.wyklovelf.map105;

import java.util.LinkedList;

/**
 * ��MyMap�й�ϣ���ظ�����MyEntry��Ŀ���󱻸��ǵ�����
 * 	MyLinkedList []arr = new MyLinkedList[999];//Map�ĵײ�ṹ���ǣ�����+����
 * @author weiyikai
 *
 */
public class MyMap03 {
	
	
	LinkedList []arr = new LinkedList[999];//Map�ĵײ�ṹ���ǣ�����+����
	
	int size;
	
	public void put(Object key,Object value) {
		MyEntry e = new MyEntry(key,value);
	
		int hash = e.hashCode();//hashCode()���ܷ��ظ�����
		
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
					e2.value = value;//��ֵ�ظ�ֱ�Ӹ���
					return;
				}
			}
			
		 	arr[a].add(e);
		}
	}
	
	
	/*
	 * �����������Ŀ�е�key��LinkedList�е�ĳһ��Ԫ�أ���Ŀ���󣩵�key��ȣ������µ���Ŀ���Ǿɵ���Ŀ��
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
		
		m3.put("����", new Wife("����"));
		
		m3.put("����", new Wife("������"));
		
		Wife w = (Wife)m3.get("����");
		
		System.out.println(w.name);
	}
}
