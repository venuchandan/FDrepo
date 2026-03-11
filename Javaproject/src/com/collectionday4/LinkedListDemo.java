package com.collectionday4;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.addFirst("a");
		System.out.println("List"+ ll);
		ll.remove(2);
		System.out.println("Removed List" +ll);
	}

}
