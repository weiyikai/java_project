package com.wyklovelf.gen01_116;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������
 * ��������
 * ����ʹ�ã���ȫ,ʡ��
 * @author weiyikai
 *
 */
public class Simple {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("123123123");//��������ͼ��
		
		String ele = list.get(0);
		
		System.out.println(ele);
		
		//JDK1.4֮ǰû�з���,�����㣬����ȫ
		List list2 = new ArrayList();
		
		list2.add("123");
		
		list2.add(2);
		
		//ȡ����
		Object obj = list2.get(0);
		//�鷳
		Integer num = (Integer)obj;
		//����ȫ
//		num = (Integer)list2.get(1);
		
		if(list2.get(1) instanceof Integer) {//�ֶ�����ת��
			num = (Integer)list2.get(1); 
		}
		
	}
}
