package com.wyklovelf.collection102;

import java.util.ArrayList;
import java.util.List;

/**
 * 自己实现一个ArrayList(基于数组)
 * @author wyk
 *
 */
public class MyArrayList /*implements List*/{//可以加"implements List"显得更为规范，全面一点，但是这只是一个测验，目的是达到一个抛砖引玉的目的
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(3);
//		StringBuilder
		
		list.add("aaa");

		list.add("bbb");
		
		list.add("ccc");
		
		
		System.out.println(list.size());
		
		list.add(3, "ddd");
		
		System.out.println(list.size());
		
		
		ArrayList list1 = new ArrayList();
		
	}
	
	private Object[] elementData;//存放对象的对象数组
	
	private int size;//数组中元素的个数

	public MyArrayList(int initialCapacity) {
		
		if(initialCapacity < 0) {//如果小于0，则抛出异常，因为数组的大小不为小于0的
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.elementData = new  Object[initialCapacity];//将initialCapacity设置为Object的初始大小
		
	}
	
	public MyArrayList() {//空构造器
		this(3);
	}
	
	public void add(Object obj) {
		
		//数组扩容和数据的拷贝
		if(size == elementData.length) {
			Object[] newArray = new Object[size*2 + 1];
		
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);//法一：如果超过了数组的长度，则将原数组从第一个位置开始，将该数组中所有的元素取出，从新数组第一个位置开始依次放入
		
//			for (int i = 0; i < elementData.length; i++) {
//				newArray[i] = elementData[i];
//			}//法二
			
			elementData = newArray;
		}
		
		elementData[size] = obj;//先赋值
		size++;//再自增		
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public Object get(int index) {
		
		if(index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return elementData[index];
	}
	
	public void remove(int index) {
		//删除指定位置的对象
		//a b c d e -----> a b d e
		if(index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int numMoved = size - index - 1;//要前移元素的个数，实际为index - (index+1),总数减去移除元素下标+1
		
		if(numMoved > 0) {
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
		}
		
		size = size - 1;
		
		elementData[size] = null;
	}
	
	public void remove(Object obj) {
		for (int i = 0; i < size; i++) {
			if(get(i).equals(obj)) {//底层调用的是equals比较的是是否指向同一个对象，而非==（比较值）
				this.remove(i);
			}
		}
	}
	
	public Object set(int index,Object obj) {
		this.rangeCheck(index);
		
		Object old = this.elementData[index];
		
		elementData[index] = obj;
		
		return old;//返回一个老的对象(也就是被替换的那个对象)
	}
	
	public void add(int index,Object obj) {
//		this.rangeCheck(index);
		//这里rangeCheck函数种index == size的情况要排除，否则无法扩容哦,因为此时的size == length是需要扩容而不是要抛出异常
//		if(index < 0 || index > size) {
//			try {
//				throw new Exception();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		//当然也可以直接与数组大小：length进行比较看是否需要扩容哦。
		if(index < 0 || index > elementData.length) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		ensureCapacity();//数组扩容
		
		elementData[size] = obj;
		
		size++;
	}
	
	private void ensureCapacity() {//扩容
		if(size == elementData.length) {
			Object[] newArray = new Object[size*2 + 1];
			
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			
			elementData = newArray;
		}
	}
	
	private void rangeCheck(int index) {
		if(index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
