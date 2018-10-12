package com.wyklovelf.linkedlist103;


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
			
			if(null == temp.next) {//如果要删除的节点是尾节点
				temp.pervious.next = null;
			}else {
				temp.pervious.next = temp.next;
				
				temp.next.pervious = temp.pervious;
			}
			
			size--;
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
		
		list.remove(3);
		
		System.out.println(list.size());
	}
}