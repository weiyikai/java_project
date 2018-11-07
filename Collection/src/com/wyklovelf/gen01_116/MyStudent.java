package com.wyklovelf.gen01_116;
/**
 * 自定义泛型类
 * @author weiyikai
 *
 *T 修饰属性，但是不能用于静态属性。
 * @param <Integer>
 */
public class MyStudent<T> {
	private T javase;
	
//	private static T javase1;//会报错Cannot make a static reference to the non-static type T
	
	public MyStudent(T javase) {
		super();
		this.javase = javase;
	}
	
	public MyStudent() {
		
	}

	public T getJavase() {
		return javase;
	}

	public void setJavase(T javase) {
		this.javase = javase;
	}
	
	
}
