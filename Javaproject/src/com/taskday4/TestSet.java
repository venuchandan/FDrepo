package com.taskday4;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> nameSet = new HashSet<Employee>();
		nameSet.add(new Employee("Alex",25000));
		nameSet.add(null);
		nameSet.add(new Employee("Alex",25000 ));
		for (Employee employee : nameSet) {
			if (employee!=null) {
			employee.displayData();
			}
		}
		Employee e1 = new Employee(101,"Alice",45000);
		Employee e2 = new Employee(101,"Alice",45000);
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		
	}

}
