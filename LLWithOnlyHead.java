package com.practise.datastructuresandalgorithms;

public class LLWithOnlyHead {
	Node head;

	public static void main(String[] args) {
		LLWithOnlyHead ll = new LLWithOnlyHead();
		ll.head = ll.insertAtFirst(1);
		ll.head = ll.insertAtFirst(2);
		ll.head = ll.insertAtFirst(3);
		ll.head = ll.insertAtLast(4);
		ll.head = ll.insertAtLast(5);
		ll.head = ll.insertAfter(6, 4);
		ll.head = ll.delete(6);
		ll.head = ll.deleteAtLast(5);
		
		ll.display(ll);
	}

	private void display(LLWithOnlyHead ll) {
		head = ll.head;
		while (head != null) {
			System.out.print(head.data + "-->");
			head = head.next;
		}
		System.out.print("END");
	}

	private Node insertAtFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			head.next = null;
		} else {
			newNode.next = head;
			head = newNode;
		}
		return head;
	}

	private Node insertAfter(int data, int index) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			head.next = null;
		} else {
			Node temp = head;
			Node lastNode = temp.next;
			while (temp.next != null) {
				if (temp.data == index) {
					temp.next = newNode;
					newNode.next = lastNode;
				}
				temp = temp.next;
				lastNode = temp.next;
			}

		}
		return head;
	}

	private Node insertAtLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			head.next = null;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = null;
		}
		return head;
	}

	private Node delete(int data) {
		if (head.data == data) {
			head = null;
			head.next = null;
		} else {
			Node temp = head;
			Node last = null;
			while (temp.next != null) {
				if(temp.next.data == data) {
					temp.next=last.next;
					last=temp.next;
				}
				temp = temp.next;
				last=temp.next;
			}
		}
		return head;
	}
	
	private Node deleteAtLast(int data) {
		if (head.data == data) {
			head = null;
			head.next = null;
		} else {
			Node temp = head;
			Node last = null;
			while (temp.next != null) {
				temp = temp.next;
				last=temp.next;
				if(last.next == null) {
					temp.next=null;
					/* last=temp.next; */
				}
				
			}
		}
		return head;
	}


	class Node {
		int data;
		Node next;

		public Node() {
		}

		public Node(int data) {
			this.data = data;
		}
	}

}
