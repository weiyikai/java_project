package com.wyklovelf.collection102;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		Collection c;
		
		List list = new ArrayList();
		
		list.add("aaa");
		
		list.add(new Date());
		
		list.add(new Dog());
		
//		list.add(1234);//包装类自动装箱功能
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
		
		List list2 = new ArrayList();
		
		list2.add("bbb");
		
		list2.add("ccc"); 
		
		list.addAll(list2);
		
		list.remove(0);
		
		System.out.println(list.size());
		
		//跟顺序有关的操作
		String str = (String)list.get(3);
		
		System.out.println(str);
		
		list.set(1,"adadadad");
		
		String str1 = (String)list.get(1);
		
		System.out.println(str1);
		
	}
}


class Dog{
	
}