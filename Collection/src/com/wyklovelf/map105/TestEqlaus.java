package com.wyklovelf.map105;

import java.util.ArrayList;
import java.util.List;

public class TestEqlaus {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		String s1 = new String("aaa");
		
		list.add(s1);
		
		String s2 = new String("aaa");
		
		list.add(s2);
		
		System.out.println(list.size());
		
		System.out.println(s1.equals(s2));
	}
}
