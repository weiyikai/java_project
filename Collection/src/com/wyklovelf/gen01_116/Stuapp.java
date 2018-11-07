package com.wyklovelf.gen01_116;

/**
 * 没有泛型的类
 * @author weiyikai
 *
 */
public class Stuapp {
	public static void main(String[] args) {
		//存入整数 自动装箱:int-(自动装箱)->Integer-(多态)->Object
		Student stu = new Student(80);
		
		Object javase = stu.getJavase();
		
		if(javase instanceof Integer) {//
			Integer javaseScore = (Integer)javase;
		}
	}
}
