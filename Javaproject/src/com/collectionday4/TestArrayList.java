package com.collectionday4;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
//		ArrayList nameList = new ArrayList();
//		nameList.add("Alex");
//		nameList.add("Aax");
//		System.out.println(nameList.get(0));
//		System.out.println(nameList);
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Venu");
		nameList.add("kote");
		System.out.println("List"+nameList);
		
		System.out.println("Using Loop for each");
		for(String strObj : nameList)
		{
			System.out.println(strObj);
		}
		System.out.println("Using iterator");
		ListIterator<String> listit = (ListIterator<String>) nameList.iterator();
		while(listit.hasNext())
		{System.out.println(listit.next());}
		
		System.out.println("Using iterator in reverse");
		while(listit.hasPrevious())
		{System.out.println(listit.hasPrevious());}
	}
		
}
