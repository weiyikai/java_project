package com.wyklovelf.gen01_116;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * �Ƿ�������	���巺�ͷ���
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
	
	//�ͷ���Դ
	public static <T extends Closeable>void test(T... a){//T... <=> T[]
		for(T temp:a) {//��T���͵Ķ���Ϊ������йر�
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
