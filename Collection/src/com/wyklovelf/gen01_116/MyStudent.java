package com.wyklovelf.gen01_116;
/**
 * �Զ��巺����
 * @author weiyikai
 *
 *T �������ԣ����ǲ������ھ�̬���ԡ�
 * @param <Integer>
 */
public class MyStudent<T> {
	private T javase;
	
//	private static T javase1;//�ᱨ��Cannot make a static reference to the non-static type T
	
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
