package com.ds.stack;
import java.util.*;

public class doubleLL {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
}
	public void insertAtFirst(int newData) {
		Node newNode = new Node(newData);
		if(head == null) {
	
		newNode.next = head;
		newNode.prev = null;
		head = newNode;
		}
		else
		{
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
				
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
}
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void printByTail() {
		Node tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}
		while(tail != null) {
			System.out.println(tail.data);
			tail = tail.prev;
		}
	}
	public static void main(String[] args) {
		doubleLL dLList = new doubleLL();
		dLList.insertAtFirst(6);
		dLList.insertAtFirst(7);
		dLList.insertAtFirst(8);
		dLList.insertAtFirst(9);
		dLList.insertAtFirst(10);
		
		System.out.println("Print from head");
		dLList.printList();
		System.out.println("print from tail");
		dLList.printByTail();
	}
}
