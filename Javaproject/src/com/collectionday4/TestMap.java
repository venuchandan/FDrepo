package com.collectionday4;
import java.util.*;
public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hMap= new HashMap<String , Integer>();
		
		hMap.put("A", 100);
		hMap.put("B", 300);
		hMap.put("D", 400);
		
		hMap.put( null, 4000);
		hMap.put( null, 4000);
		hMap.put("S",null);
		
		Set<Map.Entry<String, Integer>> st = hMap.entrySet();
		for(Map.Entry<String,Integer> m1:st)
		{
			System.out.print(m1.getKey()+":");
			System.out.println(m1.getValue());
		}
	}

}
