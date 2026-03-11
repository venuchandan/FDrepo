package com.collectionday4;
import java.util.*;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<Integer, Employee>empMap = new HashMap();
			empMap.put(101, new Employee("Alex", 45000));
			empMap.put(102, new Employee("Bob", 550000));
			
			System.out.println("Employee Hash map");
			for(Map.Entry<Integer, Employee> entry:empMap.entrySet()) {
				System.out.println("Key =" +entry.getKey() +"->");
			}
			System.out.println("Access employee with ID given: ");
			Employee emp = empMap.get(101);
			if(emp != null) {
				emp.displayData();
				
			}
			System.out.println("");
	}

}
