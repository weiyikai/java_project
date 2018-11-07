package com.wyklovelf.gen01_116;

/**
 * 泛型接口 
 * 不能使用在全局常量上
 * @author weiyikai
 *
 */
public interface Comparator<T> {
	public static final int MAX_VALUE = 1024;
	
//	public static final T MAX_MIN = 1;//在泛型接口中，泛型只能用于抽象方法中，不能用于static修饰的属性
	
	public abstract T compare(T t);
}
