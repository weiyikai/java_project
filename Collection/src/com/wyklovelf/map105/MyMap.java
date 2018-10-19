package com.wyklovelf.map105;


/**
 * 前面使用了JDK里面的Map，现在自己不完美地实现以下Map
 * Map:存放键值对，根据键对象找对应的值对象
 * 缺点：效率低
 * @author weiyikai
 *
 */
public class MyMap {
	
	int size;//Map中条目(MyEntry的数量)
	
	MyEntry []arr = new MyEntry[999];
	
	public void put(Object key,Object value) {
		MyEntry e = new MyEntry(key,value);
		
		//键不能重复，否则后一个会把前一个给覆盖掉 
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
		
		m.put("高琪", new Wife("杨幂"));
		
		Wife w = (Wife)m.get("高琪");
		
		System.out.println(w.name);
		
		System.out.println();
	}
	
	/**
	 * 
	 */ 
}

/**
 * 实现一个条目类{"A":"a"}
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
