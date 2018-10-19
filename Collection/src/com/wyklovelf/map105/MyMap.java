package com.wyklovelf.map105;


/**
 * ǰ��ʹ����JDK�����Map�������Լ���������ʵ������Map
 * Map:��ż�ֵ�ԣ����ݼ������Ҷ�Ӧ��ֵ����
 * ȱ�㣺Ч�ʵ�
 * @author weiyikai
 *
 */
public class MyMap {
	
	int size;//Map����Ŀ(MyEntry������)
	
	MyEntry []arr = new MyEntry[999];
	
	public void put(Object key,Object value) {
		MyEntry e = new MyEntry(key,value);
		
		//�������ظ��������һ�����ǰһ�������ǵ� 
		for (int i = 0; i < this.size; i++) {
			if(arr[i].key.equals(key)) {
				arr[i].value = value;
				return;
			}
		}
		
		arr[size++] = e;
	}
	
	public Object get(Object key) {
		for (int i = 0; i < this.size; i++) {
			if(arr[i].key.equals(key)) {
				return arr[i].value;
			}
		}
		return null;
	}
	
	public boolean containsKey(Object key) {
		for (int i = 0; i < this.size; i++) {
			if(arr[i].key.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean containsValue(Object value) {
		for (int i = 0; i < this.size; i++) {
			if(arr[i].value.equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		MyMap m = new MyMap();
		
		m.put("����", new Wife("����"));
		
		Wife w = (Wife)m.get("����");
		
		System.out.println(w.name);
		
		System.out.println();
	}
	
	/**
	 * 
	 */ 
}

/**
 * ʵ��һ����Ŀ��{"A":"a"}
 * @author weiyikai
 *
 */
class MyEntry{
	Object key;
	
	Object value;

	public MyEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
}
