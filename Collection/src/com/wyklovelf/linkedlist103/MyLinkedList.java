package com.wyklovelf.linkedlist103;


/**
 * 
 * @author wyk
 *
 */
public class MyLinkedList{//这里只是简单的重写List接口中的主要方法，并不规范哦。
	
	private Node first;  
	
	private Node last;
	
	
	private int size;
	
	public int size() {
		return size;
	}
	
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
			
			n.pervious = null;
			
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
	
	public Object get(int index) {
		if(null == first) {//头节点为空，表示此列表为空，返回null
			return null;
		}else {
			Node temp = new Node();
			
			temp = first;
			
			int count = 0;
			
			while(temp.next != null) {
				
				if(count == index) {
					return temp.obj;
				}
				
				temp = temp.next;
				
				count++;
			}
			
			return null;
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
		
		System.out.println(list.get(4));
	}
}