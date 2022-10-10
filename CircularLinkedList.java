package com.practise.datastructuresandalgorithms;

public class CircularLinkedList {

	static Node addToEmpty(Node last, int data) {
		// This function is only for empty list
		if (last != null)
			return last;

		Node newNode = new Node();
		newNode.data = data;
		last=newNode;
		newNode.next=last;
		return last;
	}

	static Node addAtBeginning(Node last, int data) {
		// This function is only for empty list
		if (last == null)
			return last;
		Node newNode = new Node();
		newNode.data = data;
		newNode.next=last.next;
		last.next=newNode;
		return last;
	}
	
	static Node addAtEnd(Node last, int data) {
		// This function is only for empty list
		if (last == null)
			return last;
		Node newNode = new Node();
		newNode.data = data;
		newNode.next=last.next;
		last.next=newNode;
		last=newNode;

		return last;
	}


	public static void main(String[] args) {
		Node last = null;
		last = addToEmpty(last, 1);
		last=addAtBeginning(last,2);
		last=addAtBeginning(last,3);
		last=addAtEnd(last,4);
		last=addAtEnd(last,5);

	}

}

class Node {
	int data;
	Node next;
}
