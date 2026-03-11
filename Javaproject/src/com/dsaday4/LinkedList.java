package com.dsaday4;

public class LinkedList {
		Node head;
		class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data = data;
				this.next = null;
			}
		}
		
		public void insertAtFirst(int newData) {
			Node newNode = new Node(newData);
			newNode.next = head;
			head = newNode;
		}
		
		public void insertAfterNode(int prevData, int newData) {
			Node temp = head;
			while(temp != null) {
				if(temp.data == prevData) {
					Node newNode = new Node(newData);
					newNode.next = temp.next;
					temp.next = newNode;
					return;
				}
				temp = temp.next;
			}
		}
		
		public void insertAtEnd(int newData) {
			Node newNode = new Node(newData);
			if(head == null) {
				head = newNode;
				return;
				
			}else {
				Node last;
				last = head;
				
				while(last.next != null) {
					last = last.next; 
				}
				
				//Move the control to the last of the list after complition of a while loop
			last.next = newNode;
			}
			
		}
		
		public void deleteNode(int value) {
			boolean nodeFound = searchNode(value);
			if(nodeFound) {
				if(head.data == value) {
					
					head = head.next;
				}else {
					Node temp = head.next;
					Node prev = head;
					while(temp != null) {
						
						if(temp.data == value) {
							prev.next = temp.next;
						}
						prev = prev.next;
						temp = temp.next;
					
					}
				}
			}else {
				System.out.println("Element not found");
			}
			
		}
		public boolean searchNode(int key) {
			Node temp = head;
			while(temp != null) {
				if(temp.data == key) {
					return true;
					
				}else {
					temp = temp.next;
				}
			}
				return false;
			}
		
		public void printList() {
			Node temp = head;
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		public static void main(String [] args) {
			LinkedList LLnode = new LinkedList();
			LLnode.insertAtEnd(5);
			LLnode.insertAtEnd(6);
			LLnode.insertAtEnd(7);
			LLnode.insertAtEnd(8);
			LLnode.insertAtEnd(9);
			
			LLnode.insertAtFirst(1);
			LLnode.insertAfterNode(6, 10);
			LLnode.printList();
			System.out.println("After delete");
			LLnode.deleteNode(6);
			LLnode.printList();
			boolean result = LLnode.searchNode(8);
			System.out.println(result);
			
			boolean result1 = LLnode.searchNode(100);
			System.out.println(result1);
		}
}

