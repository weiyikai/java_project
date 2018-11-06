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
	
		int hash = e.key.hashCode();//hashCode()���ܷ��ظ�����
		
		hash = hash < 0 ? -hash:hash;
		
		int a = hash%arr.length;
		
		if(null == arr[a]) {//arr[a]��������Ϊ��,��Ҫ�ڴ˴��½�һ������������e��Ŀ��
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
			
		 	arr[a].add(e);//�����ظ�����arr[a]����������ֱ�ӷ���e��Ŀ����
		}
		size++;
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
		
//		//hashCode��ȣ������ݲ�һ����ͬ����������ȣ�hashCodeһ�����
//		
//		MyEntry e1 = new MyEntry("����","����");
//		
//		MyEntry e2 = new MyEntry("����","������");
//		
//		System.out.println(e1.key.hashCode()%999);
//		
//		System.out.println(e2.key.hashCode()%999);
		
		MyMap03 m3 = new MyMap03();
		
		m3.put(1, new Wife("����"));
		
		m3.put(1, new Wife("������"));
		
		Wife w = (Wife)m3.get(1);
		
		System.out.println(w.name);
	}
}
