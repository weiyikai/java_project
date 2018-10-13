

package com.wyklovelf.linkedlist103;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestForeach {
	public static void main(String[] args) {
		TestForeach tf = new TestForeach();
		tf.initArray();
		tf.listToArray();
		tf.twoDimensionArray();
		tf.threeDimensionArray();
	}
	
	public void initArray() {
		//定义并且初始化一个数组
		int arr[] = {2,5,1};
		
		System.out.println("————排序前的一维数组：");
		for(int i:arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//数组冒泡排序
		Arrays.sort(arr);
		
		//foreach输出排序之后的arr数组元素
		System.out.println("————排序后的一维数组：");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	//集合转换成数组
	public void listToArray() {
		//创建list并且添加元素
		List<String> list = new ArrayList<String>();
		
		list.add("123");
		
		list.add("456");
		
		list.add("789");
		
		//foreach循环输出集合元素
		System.out.println("————foreach输出集合元素");
		for (String s : list) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		//把ArrayList转换成数组
		Object []obj = list.toArray();
		
		System.out.println("————foreach输出集合转换而来的数组元素");
		
		for (Object object : obj) {
			System.out.print(object.toString()+ " ");
		}
		
		System.out.println();
	}
	
	//foreach输出二维数组
	public void twoDimensionArray() {
		int arr[][] = {{1,2,3},{3,2,1}};
		
		System.out.println("————foreach输出二维数组");
		
		for (int[] is : arr) {
			for(int e: is) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}
	
	//foreach输出三维数组
	public void threeDimensionArray() {
		int arr[][][] = {
				{{1,2},{3,4}},
				{{5,6},{7,8}}
		};
		
		System.out.println("————foreach输出三维数组");
		for (int[][] is : arr) {
			for(int [] is1 : is) {
				for(int e : is1) {
					System.out.print(e + " ");
				}
//				System.out.println();
			}
//			System.out.println();
		}
	}
}
