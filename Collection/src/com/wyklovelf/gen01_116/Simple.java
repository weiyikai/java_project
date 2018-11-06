package com.wyklovelf.gen01_116;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型入门
 * 泛化类型
 * 方便使用，安全,省心
 * @author weiyikai
 *
 */
public class Simple {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("123123123");//会进行类型检查
		
		String ele = list.get(0);
		
		System.out.println(ele);
		
		//JDK1.4之前没有泛型,不方便，不安全
		List list2 = new ArrayList();
		
		list2.add("123");
		
		list2.add(2);
		
		//取数据
		Object obj = list2.get(0);
		//麻烦
		Integer num = (Integer)obj;
		//不安全
//		num = (Integer)list2.get(1);
		
		if(list2.get(1) instanceof Integer) {//手动类型转换
			num = (Integer)list2.get(1); 
		}
		
	}
}
