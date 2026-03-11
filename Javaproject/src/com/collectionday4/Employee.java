package com.collectionday4;
import java.util.Scanner;
public class Employee {
	public int empid;
	public String name;
	public double salary;
	
	static int counter = 0;
	
	public Employee(){
		empid = 0;
		name = "null";
		salary = 0.0;
	}
	
	Employee( String name, double salary){
		empid = ++counter;
		this.name = name;
		this.salary = salary;
	}
	
	public void acceptData( Scanner read ) {
		empid = ++counter;
		
		System.out.println("Enter Employee Name: ");
		read.nextLine();
		name = read.nextLine();
		
		System.out.println("Enter Employee Salary: ");
		salary = read.nextDouble();

	}
	
	void displayData() {
		System.out.println();
		System.out.println("Employee Id: " + empid);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
	}
}
