package com.wyklovelf.gen01_116;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 非泛型类中	定义泛型方法
 * @author weiyikai
 *
 */
public class Method {
	public static <T extends List> void test(T t) {
		System.out.println(t);
		t.add("123"); 
	}
	
	public static <T>void main(String[] args) throws FileNotFoundException {
		test(new ArrayList());
		
		test(new FileInputStream("a.txt"));
	}
	
	//释放资源
	public static <T extends Closeable>void test(T... a){//T... <=> T[]
		for(T temp:a) {//若T类型的对象不为空则进行关闭
			if(null != temp) {
				try {
					temp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		}
	}
}
