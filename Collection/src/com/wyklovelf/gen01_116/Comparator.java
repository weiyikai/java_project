package com.wyklovelf.gen01_116;

/**
 * ���ͽӿ� 
 * ����ʹ����ȫ�ֳ�����
 * @author weiyikai
 *
 */
public interface Comparator<T> {
	public static final int MAX_VALUE = 1024;
	
//	public static final T MAX_MIN = 1;//�ڷ��ͽӿ��У�����ֻ�����ڳ��󷽷��У���������static���ε�����
	
	public abstract T compare(T t);
}
