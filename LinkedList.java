/*
 * package com.practise.datastructuresandalgorithms;
 * 
 * public class LinkedList { Node head;
 * 
 * public static LinkedList addElements(LinkedList list, int data) { Node
 * newNode = new Node(data); if (list.head == null) { list.head = newNode; }
 * else { Node previousNode = list.head; while (previousNode.next != null) {
 * previousNode = previousNode.next; } previousNode.next = newNode; } return
 * list; }
 * 
 * public static LinkedList deleteElement(LinkedList list, int key) { Node head
 * = list.head; if (head.data == key) { list.head = head.next; } else { Node
 * previousNode = list.head; Node currentNode = previousNode.next; while
 * (currentNode != null) { if (currentNode.data == key) { previousNode.next =
 * currentNode.next; break; } else { currentNode = currentNode.next;
 * previousNode = previousNode.next; }
 * 
 * } } return list; }
 * 
 * public static void printElements(LinkedList list) { Node node = list.head;
 * while (node != null) { System.out.print(node.data); node = node.next; }
 * 
 * }
 * 
 * public static void main(String[] args) { LinkedList list = new LinkedList();
 * list = addElements(list, 1); list = addElements(list, 2); list =
 * addElements(list, 3); list = addElements(list, 4); list = addElements(list,
 * 5);
 * 
 * printElements(list); LinkedList delList = deleteElement(list, 3);
 * System.out.println("after delete"); printElements(delList);
 * 
 * }
 * 
 * }
 * 
 * class Node { int data; Node next;
 * 
 * Node(int data) { this.data = data; } }
 */