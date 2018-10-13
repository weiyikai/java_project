package com.wyklovelf.collection102;

import java.util.ArrayList;
import java.util.List;

/**
 * 对ArrayList的一些常用方法的使用
 * @author wyk
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
//		list.set(1, "456");//if(index >= size)时抛出异常
		
		list.add(3, "321");//if(index > size || index < 0)时抛出异常
		
		list.add("456");
		
		System.out.println(list.size());
		
		System.out.println(list.toString());
		
		list.add(1,"111");
		
		System.out.println(list.size());
		
		System.out.println(list.toString());
	}
}
