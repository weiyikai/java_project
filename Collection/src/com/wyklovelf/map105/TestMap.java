package com.wyklovelf.map105;

import java.util.HashMap;
import java.util.Map;

/**
 * JDK��Map����
 * @author weiyikai
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map<String, Wife> map = new HashMap<String, Wife>();
		
		map.put("ΤС��", new Wife("������"));
		
		
		Wife w = (Wife)map.get("ΤС��");
		
//		map.remove("ΤС��");
		
		boolean is = map.containsKey("ΤС��");
		
//		boolean is = map.containsValue(new Wife("������"));
		
		System.out.println(w.name);
		
		System.out.println(is);
		
		
	}
}

class Wife{
	String name;
	
	public 	Wife(String name) {
		this.name = name;
	}
}
