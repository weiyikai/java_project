package com.wyklovelf.collection102;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ArrayList��һЩ���÷�����ʹ��
 * @author wake
 *
 */
public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(2);
		
		System.out.println(list.size());
		
		list.add("123");
		
		System.out.println(list.size());
		
//		list.add("321");
//		
//		list.set(1, "456");//if(index >= size)ʱ�׳��쳣
		
		list.add(3, "321");//if(index > size || index < 0)ʱ�׳��쳣
		
		list.add("456");
		
		System.out.println(list.size());
		
		System.out.println(list.toString());
		
		list.add(1,"111");
		
		System.out.println(list.size());
		
		System.out.println(list.toString());
	}
}
