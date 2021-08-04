package com.liyen.singlylinkedlist;

public class ListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.printValues();
        Node node = sll.find(4);
        System.out.println(node.value);
        System.out.println(node.next.value);
        
	}
	

}
