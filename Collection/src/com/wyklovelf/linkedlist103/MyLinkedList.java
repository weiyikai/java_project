package com.wyklovelf.linkedlist103;

import java.util.LinkedList;

/**
 * 
 * @author wake
 * 这里做的是双向列表
 *
 */
public class MyLinkedList{//这里只是简单的重写List接口中的主要方法，并不规范哦。
	
	private Node first;  
	
	private Node last;
	
	
	private int size;
	
	public int size() {
		return size;
	}
	
	
	/**
	 * 根据index索引遍历链表(二分法)
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
	 * add方法，在列表尾巴上加节点（！=插入）
	 * @param obj
	 */
	public void add(Object obj) {
		Node n = new Node();//新建一个节点	
		if(null == first) {//如果第一个节点为空，表示此列表中暂时一个节点也没有
//			Node n = new Node();//新建一个节点
			
			n.pervious = null;//让它的pervious部分为空，表示此节点为头结点
			
			n.obj = obj;//往进丢obj对象
			
			n.next = null;//下一个节点暂时还不知道，所以先置为空
			
			first = n;//此时列表中只有一个节点，所以头结点就是n
			
			last = n;//同理，尾节点也是n
		
		}else {
			//first节点不为空时，直接在last节点后加一个新的节点
//			Node n = new Node();
			
			n.pervious = last;
			
			n.obj = obj;
			
			n.next = null;
			
			last.next = n;
			
			last = n;//在尾巴上新加一个节点，此节点成为了最后一个节点。
		}
		
		size++;
	}
	
//	public void delete(Object obj) {
//		if(null == first) {//若头结点为空,证明该链表为空
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
	 * get方法，根据指定索引，返回该索引处节点的obj属性
	 */
	public Object get(int index) {
		
		rangeCheck(index);
		
		Node temp = new Node();
		
		if(null == first) {//头节点为空，表示此列表为空，返回null
			return null;
		}else {
			
			
			temp = first;
			
			for (int i = 0; i < index; i++) {//遍历列表到index时，返回该处节点的obj属性
				temp = temp.next;
			}
		}
		return temp.obj;
	}
	
	/*
	 * remove删除指定索引位置的节点
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
			for (int i = 0; i < index; i++) {//找到要删除的节点的位置
				temp = temp.next;
			}
			                        
			if(first != temp && null == temp.next) {//如果要删除的节点是尾节点,是尾节点的理解：就是当前节点不是头节点,并且它的next属性为空
				temp.pervious.next = null;
				last = temp.pervious;
			}else if(first == temp && null == temp.next){//当前列表只有一个节点，即头节点就是要删除的当前节点
				first = null;
			}else if(first == temp && null != temp.next) {//要删除的当前节点是头节点，而且此列表中不止这一个头节点
				temp.next.pervious = null;
				first = temp.next;
			}else if(first != temp && null != temp.next) {//当前节点既不是头节点，也不是尾节点
				temp.pervious.next = temp.next;
				 
				temp.next.pervious = temp.pervious;  
			}
			
			size--;
		}
	}
	
	/**
	 * 重载add方法,在下表为index的元素之前插入属性为obj的元素,这里的插入只允许插在index处元素的前面
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
		
		//LinkedList不需要扩容
		if(null == first) {
			
			n.pervious = null;
			
			n.next = null;
			
			first = n;
			
			last = n;
		}else {
			Node temp = new Node();
			
			temp = first;
			
			for (int i = 0; i < index; i++) {//找到要删除的节点的位置
				temp = temp.next;
			}
			
			if(first == temp) {//如果要在头节点前插入一个节点
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