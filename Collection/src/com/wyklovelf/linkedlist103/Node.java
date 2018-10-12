package com.wyklovelf.linkedlist103;

/**
 * 节点类
 * @author wyk
 *
 */
public class Node {
		Node pervious;//存放前一个节点
		
		Object obj;//存放本节点的值
		
		Node next;//存放下一个节点

		public Node(Node pervious, Object obj, Node next) {
			super();
			this.pervious = pervious;
			this.obj = obj;
			this.next = next;
		}

		public Node() {
			
		}
}