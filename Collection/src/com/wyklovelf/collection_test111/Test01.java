package com.wyklovelf.collection_test111;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args){
		
		//һ�������Ӧһ�м�¼
		
		Employee e = new Employee(0301,"����",3000,"��Ŀ��","2018-10-28");	
		Employee e2 = new Employee(0302,"��ʿ��",3500,"��ѧ��","2018-10-27");	
		Employee e3 = new Employee(0303,"����",3550,"��ѧ��","2018-10-26");
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e);
		
		list.add(e2);
		
		list.add(e3);
		
		//��̬����ֻ�ܵ��þ�̬����
		print(list);
	}
	
	public static void print(List<Employee> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}
}
