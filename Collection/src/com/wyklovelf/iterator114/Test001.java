package com.wyklovelf.iterator114;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Iterator������
 * @author weiyikai
 *
 */
public class Test001 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Set set = new HashSet();
		
		set.add("κ1");
		set.add("κ2");
		set.add("κ3");
		
		//while
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			String str = (String)itor.next();
			System.out.println(str);
		}
		
		//for
		for(Iterator itor1 = set.iterator();itor1.hasNext();) {
			String str1 = (String)itor1.next();
			System.out.println(str1);
		}
	}
}
