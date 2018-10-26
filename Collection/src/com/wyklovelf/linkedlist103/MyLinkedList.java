package com.wyklovelf.linkedlist103;

import java.util.LinkedList;

/**
 * 
 * @author wake
 * ����������˫���б�
 *
 */
public class MyLinkedList{//����ֻ�Ǽ򵥵���дList�ӿ��е���Ҫ�����������淶Ŷ��
	
	private Node first;  
	
	private Node last;
	
	
	private int size;
	
	public int size() {
		return size;
	}
	
	
	/**
	 * ����index������������(���ַ�)
	 * @return
	 */
	public Node node(int index) {
		Node temp = null;
		
		if(null != first) {
			if(index < this.size >> 2) {
				
				temp = first;
				
				for (int i = 0; i < index; i++) {
					temp = temp.next;
				}
			}else {
				
				temp = this.last;
				
				for (int i = this.size - 1; i > index ; i--) {
					temp = temp.pervious;
				}
			}
		}
		
		return null;
	}
	
	/**
	 * add���������б�β���ϼӽڵ㣨��=���룩
	 * @param obj
	 */
	public void add(Object obj) {
		Node n = new Node();//�½�һ���ڵ�	
		if(null == first) {//�����һ���ڵ�Ϊ�գ���ʾ���б�����ʱһ���ڵ�Ҳû��
//			Node n = new Node();//�½�һ���ڵ�
			
			n.pervious = null;//������pervious����Ϊ�գ���ʾ�˽ڵ�Ϊͷ���
			
			n.obj = obj;//������obj����
			
			n.next = null;//��һ���ڵ���ʱ����֪������������Ϊ��
			
			first = n;//��ʱ�б���ֻ��һ���ڵ㣬����ͷ������n
			
			last = n;//ͬ��β�ڵ�Ҳ��n
		
		}else {
			//first�ڵ㲻Ϊ��ʱ��ֱ����last�ڵ���һ���µĽڵ�
//			Node n = new Node();
			
			n.pervious = last;
			
			n.obj = obj;
			
			n.next = null;
			
			last.next = n;
			
			last = n;//��β�����¼�һ���ڵ㣬�˽ڵ��Ϊ�����һ���ڵ㡣
		}
		
		size++;
	}
	
//	public void delete(Object obj) {
//		if(null == first) {//��ͷ���Ϊ��,֤��������Ϊ��
//			System.out.println("List is empty!");
//		}else {
//			while()
//		}
//	}
	
	private void rangeCheck(int index) {
		if(index<0 || index>=this.size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * get����������ָ�����������ظ��������ڵ��obj����
	 */
	public Object get(int index) {
		
		rangeCheck(index);
		
		Node temp = new Node();
		
		if(null == first) {//ͷ�ڵ�Ϊ�գ���ʾ���б�Ϊ�գ�����null
			return null;
		}else {
			
			
			temp = first;
			
			for (int i = 0; i < index; i++) {//�����б�indexʱ�����ظô��ڵ��obj����
				temp = temp.next;
			}
		}
		return temp.obj;
	}
	
	/*
	 * removeɾ��ָ������λ�õĽڵ�
	 */
	public void remove(int index) {
		rangeCheck(index);
		
		if(null == first) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}else {
			Node temp = new Node();
			temp = first;
			for (int i = 0; i < index; i++) {//�ҵ�Ҫɾ���Ľڵ��λ��
				temp = temp.next;
			}
			                        
			if(first != temp && null == temp.next) {//���Ҫɾ���Ľڵ���β�ڵ�,��β�ڵ����⣺���ǵ�ǰ�ڵ㲻��ͷ�ڵ�,��������next����Ϊ��
				temp.pervious.next = null;
				last = temp.pervious;
			}else if(first == temp && null == temp.next){//��ǰ�б�ֻ��һ���ڵ㣬��ͷ�ڵ����Ҫɾ���ĵ�ǰ�ڵ�
				first = null;
			}else if(first == temp && null != temp.next) {//Ҫɾ���ĵ�ǰ�ڵ���ͷ�ڵ㣬���Ҵ��б��в�ֹ��һ��ͷ�ڵ�
				temp.next.pervious = null;
				first = temp.next;
			}else if(first != temp && null != temp.next) {//��ǰ�ڵ�Ȳ���ͷ�ڵ㣬Ҳ����β�ڵ�
				temp.pervious.next = temp.next;
				 
				temp.next.pervious = temp.pervious;  
			}
			
			size--;
		}
	}
	
	/**
	 * ����add����,���±�Ϊindex��Ԫ��֮ǰ��������Ϊobj��Ԫ��,����Ĳ���ֻ�������index��Ԫ�ص�ǰ��
	 * @param index
	 * @param obj
	 */
	public void add(int index,Object obj) {
//		LinkedList tp = new LinkedList();
		if(index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		Node n = new Node();
		
		n.obj = obj;
		
		//LinkedList����Ҫ����
		if(null == first) {
			
			n.pervious = null;
			
			n.next = null;
			
			first = n;
			
			last = n;
		}else {
			Node temp = new Node();
			
			temp = first;
			
			for (int i = 0; i < index; i++) {//�ҵ�Ҫɾ���Ľڵ��λ��
				temp = temp.next;
			}
			
			if(first == temp) {//���Ҫ��ͷ�ڵ�ǰ����һ���ڵ�
				temp.pervious = n;
				
				n.next = temp;
				
				n.pervious = null;
				
				first = n;
		
			}else {
				temp.pervious.next = n;
				
				n.pervious = temp.pervious;
				
				n.next = temp;
				
				temp.pervious = n;
			
			}
			size++;
		}
	}
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		
		list.add("aaa");
		
		System.out.println(list.size());
		
		list.add("bbb");
		
		System.out.println(list.size());
		
		list.add("ccc");
		
		System.out.println(list.size());
		
		list.add("ddd");
		
		System.out.println(list.size());
		
		System.out.println(list.get(3));
		
		list.add(3,"DDD");
		
//		list.remove(3);
		
//		System.out.println(list.size());
	}
}