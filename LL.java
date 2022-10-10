
package com.practise.datastructuresandalgorithms;

public class LL {
	Node head;
	Node tail;
	int size;

	public void insertFirst(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
		}
		size++;
	}

	public void insertLast(int data) {
		if (tail == null) {
			insertFirst(data);
			return;
		}

		Node temp = new Node(data);
		tail.next = temp;
		tail = temp;
		size++;

	}

	public void insert(int data, int index) {
		if (head == null) {
			insertFirst(data);
			return;
		}

		if (size == index) {
			insertLast(data);
			return;
		}

		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;

		}
		Node node = new Node(data, temp.next);
		temp.next = node;

		size++;

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LL ll = new LL();
		ll.insertFirst(6);
		ll.insertFirst(9);
		ll.insertFirst(5);
		ll.insertFirst(7);
		ll.insertLast(3);
		ll.insert(4, 3);
		ll.display();
	}

	private class Node {
		int data;
		Node next;

		public Node() {
		}

		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
}
