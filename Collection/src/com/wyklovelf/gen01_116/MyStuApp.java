package com.wyklovelf.gen01_116;

/**
 * �Զ��巺�����ʹ�ã�������ʱָ����������ͣ����ǲ���Ϊ��������
 * @author weiyikai
 *
 */
public class MyStuApp {
	public static void main(String[] args) {
//		MyStudent<int> ms = new MyStudent<int>();//Syntax error, insert "Dimensions" to complete ReferenceType
		
		MyStudent<Integer> ms = new MyStudent<Integer>();
		
		//��ȫ
//		ms.setJavase("1");//�Զ����ͼ��
		ms.setJavase(1);
		
		//ʡ�ģ��Զ�����ת��(T-->Integer)��Ҳ����Ҫ���������ж��ˣ�
		Integer i = ms.getJavase();
	}
}
