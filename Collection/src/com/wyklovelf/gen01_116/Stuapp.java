package com.wyklovelf.gen01_116;

/**
 * û�з��͵���
 * @author weiyikai
 *
 */
public class Stuapp {
	public static void main(String[] args) {
		//�������� �Զ�װ��:int-(�Զ�װ��)->Integer-(��̬)->Object
		Student stu = new Student(80);
		
		Object javase = stu.getJavase();
		
		if(javase instanceof Integer) {//
			Integer javaseScore = (Integer)javase;
		}
	}
}
