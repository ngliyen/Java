package com.liyen.singlylinkedlist;

public class SinglyLinkedList {
	public Node head;
	public SinglyLinkedList() {
		this.head = null;
	}
	
	// adds a node to the back of list
	public void add(int value) {
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
		} else {
			Node runner = head;
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}
	
	public void remove() {
		if (this.head == null || this.head.next == null) {
			this.head = null;
		}
		// if there are only two elements
		else if (this.head.next.next == null) {
			this.head.next = null;
		}
		else {
			Node runner = head;
			while(runner.next.next != null) {
				runner = runner.next;				
			}
			runner.next = null;
		}
	}
	
	public void printValues() {
		Node runner = this.head;
		while (runner != null) {
			System.out.println(runner.value);
			runner = runner.next;
		}
	}
	
	public Node find(int value) {
		Node runner = this.head;
		while (runner!=null) {
			if (runner.value == value) {
//				System.out.println(value);
				return runner;
			}
			runner = runner.next;
		}
//		System.out.println("Value not found");
		return null;
	}
	
}
