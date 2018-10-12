package com.wyklovelf.collection102;

public class Test02 {
	public static void main(String[] args) {
		int n = 3,m = 3;
		System.out.println(m == n);
		
		String str = new String("hello");
		
		String str1 = new String("hello");
		
		String str2 = new String("hello");
		
		System.out.println("str1和str2指向不同的对象");
		System.out.println(str1 == str2);
		
		str1 = str;
		
		str2 = str;
		
		System.out.println("str1和str2指向相同的对象");
		System.out.println(str1 == str2);
		
		System.out.println("String类对equals方法进行重写，原来比较两个对象引用是否指向同一个对象，重写后比较的是两个对象引用指向对象的你value字符数组是否相同");
		System.out.println(str1.equals(str2));//String对象对equals方法进行了重写，比较的是指向的内容了。】
		
		
	}
}
