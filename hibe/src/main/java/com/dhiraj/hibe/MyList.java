package com.dhiraj.hibe;


/**
 * @author Dhiraj Prasad
 *
 */
public class MyList {
	private Node head;
	int count;
	
	public MyList() {
		head= new Node(null); 
		count=0;
	}
	public Node getHead() {
		return head;
	}


	public void setHead(Node head) {
		this.head = head;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	private class Node{
		Object data;
		Node next;
		public Node() {
		}
		
		public Node(Object data) {
			super();
			this.data = data;
			next=null;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		
		
		
	}
	
	public int add(Object object){
		Node temp= new Node(object);
		Node current =this.head;
		while (current.getNext()!= null){
			current=current.getNext();
		}
			current.setNext(temp);	
		return 0;
		
	}
	@Override
	public String toString() {
		Node current = head.getNext();
		String output = "";
		while(current != null)
		{
			output += "[" + current.getData().toString() + "]";
			current = current.getNext();
		}
		return output;
	}
	
}
