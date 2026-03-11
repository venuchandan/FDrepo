package com.ds.stack;

public class StackByLL {
	static class Node
{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
			
		}
}
	private Node top;
	StackByLL(){
		top = null;
	}
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		
		System.out.println("Data has been Pushed");
	}
public int pop() {
		if(top == null) {
			System.out.println("Stack is Empty");
			return -1;
		}else {
			int temp = top.data;
			top = top.next;
			return temp;
		}
		
	}
	public static void main(String[] args) {
		StackByLL stackList = new StackByLL();
		stackList.push(3);
		stackList.push(4);
		stackList.push(5);
		stackList.push(6);
		stackList.push(7);
		
		
		System.out.println("Popped" +stackList.pop());
		System.out.println("Popped" +stackList.pop());
		
	}




}
