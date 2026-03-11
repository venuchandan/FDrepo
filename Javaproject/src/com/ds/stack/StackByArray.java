package com.ds.stack;

import java.util.NoSuchElementException;

public class StackByArray {
	private int top;
	private int[] stack;
	public StackByArray(int capacity) {
		stack = new int[capacity];
		top = -1;	
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == stack.length - 1;
	}
	public void push(int x) {
		if(isFull()) {
			throw new IllegalStateException();
		}else {
			stack[++top] = x;
		}
	}
	public int pop() {
		if(isEmpty()) {
			throw new NoSuchElementException();
			
		}
		return stack[top--];
		}
	public static void main(String[] args) {
		StackByArray myStack = new StackByArray(5);
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}
	
}
