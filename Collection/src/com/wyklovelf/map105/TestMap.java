package com.wyklovelf.map105;

import java.util.HashMap;
import java.util.Map;

/**
 * JDKµÄMap²âÊÔ
 * @author weiyikai
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map<String, Wife> map = new HashMap<String, Wife>();
		
		map.put("Î¤Ğ¡±¦", new Wife("ÕÅÂüÓñ"));
		
		
		Wife w = (Wife)map.get("Î¤Ğ¡±¦");
		
//		map.remove("Î¤Ğ¡±¦");
		
		boolean is = map.containsKey("Î¤Ğ¡±¦");
		
//		boolean is = map.containsValue(new Wife("ÕÅÂüÓñ"));
		
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
