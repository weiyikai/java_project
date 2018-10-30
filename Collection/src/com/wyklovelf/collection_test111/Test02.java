package com.wyklovelf.collection_test111;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("id", 0301);
		map.put("name", "高琪");
		map.put("salary", "3050");
		map.put("department", "项目部");
		map.put("hireDate", "2018-10-30");
		
		Map map1 = new HashMap();
		map1.put("id", 0302);
		map1.put("name", "高琪1");
		map1.put("salary", "3051");
		map1.put("department", "项目部1");
		map1.put("hireDate", "2018-10-31");
		
		Map map2 = new HashMap();
		map2.put("id", 0303);
		map2.put("name", "高琪2");
		map2.put("salary", "3052");
		map2.put("department", "项目部2");
		map2.put("hireDate", "2018-10-29");
		
		List<Map> list = new ArrayList<Map>();
		
		list.add(map);
		list.add(map1);
		list.add(map2);
		
		print(list);
	}
	
	public static void print(List<Map> list) {
		for (int i = 0; i < list.size(); i++) {
			Map temp = list.get(i);
			
			System.out.println(temp.get("name") +"---"+ temp.get("department"));
		}
	}
}
