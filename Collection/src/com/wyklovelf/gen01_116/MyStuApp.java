package com.wyklovelf.gen01_116;

/**
 * 自定义泛型类的使用，在声明时指定具体的类型，但是不能为基本类型
 * @author weiyikai
 *
 */
public class MyStuApp {
	public static void main(String[] args) {
//		MyStudent<int> ms = new MyStudent<int>();//Syntax error, insert "Dimensions" to complete ReferenceType
		
		MyStudent<Integer> ms = new MyStudent<Integer>();
		
		//安全
//		ms.setJavase("1");//自动类型检查
		ms.setJavase(1);
		
		//省心（自动类型转换(T-->Integer)，也不需要进行类型判断了）
		Integer i = ms.getJavase();
	}
}
