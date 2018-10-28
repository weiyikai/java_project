package com.wyklovelf.collection_test111;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args){
		
		//一个对象对应一行记录
		
		Employee e = new Employee(0301,"高琪",3000,"项目部","2018-10-28");	
		Employee e2 = new Employee(0302,"马士斌",3500,"教学部","2018-10-27");	
		Employee e3 = new Employee(0303,"裴新",3550,"教学部","2018-10-26");
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e);
		
		list.add(e2);
		
		list.add(e3);
		
		//静态方法只能调用静态方法
		print(list);
	}
	
	public static void print(List<Employee> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}
}
