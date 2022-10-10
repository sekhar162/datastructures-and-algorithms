package com.practise.datastructuresandalgorithms;

public class LLWithHeadAndTail {
	Node head;
	Node tail;
	int size;

	public static void main(String[] args) {
		LLWithHeadAndTail ll = new LLWithHeadAndTail();
		ll.insertFirst(4);
		ll.insertFirst(3);
		ll.insertFirst(2);
		ll.insertFirst(1);
		ll.insertLast(5);
		ll.insertLast(6);
		ll.insertAt(7, 3);
		ll.deleteFirst();
		display(ll);
	}

	private void insertFirst(int data) {
		Node newNode = new Node(data);

		newNode.next = head;
		head = newNode;

		if (tail == null) {
			tail = head;
		}
		size = size + 1;
	}

	private void insertLast(int data) {
		Node newNode = new Node(data);
		if (tail == null) {
			insertFirst(data);
		}
		tail.next = newNode;
		tail = newNode;
		size = size + 1;
	}

	private void insertAt(int data, int index) {
		if (index == 0) {
			insertFirst(data);
			return;
		}
		if (index == size) {
			insertLast(data);
			return;
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node newNode = new Node(data, temp.next);
		temp.next = newNode;
		size++;
	}

	public int deleteFirst() {
		int value = head.data;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
		return value;
	}

	private static void display(LLWithHeadAndTail ll) {

		Node node = ll.head;
		while (node != null) {
			System.out.print(node.data + "-->");
			node = node.next;
		}
		System.out.print("End");
	}

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
}
