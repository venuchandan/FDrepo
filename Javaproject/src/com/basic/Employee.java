package com.basic;
import java.util.Scanner;
public class Employee {
	int empid;
	String name;
	double salary;
	
	static int counter = 100;
	
	Employee(){
		counter++;
		empid = counter;
		name = "Not set";
		salary = 0.0;
		
	}
	
	Employee(String name,double salary){
		counter++;
		empid=counter;
		this.name=name;
		this.salary=salary;
	}
	void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		System.out.println("Enter salary: ");
		salary=sc.nextDouble();
	}
	void displayData() {
		System.out.println("Emp ID :"+empid);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	
	void incrementSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter increment amount: ");
		double inc = sc.nextDouble();
		salary+=inc;
		System.out.println("Salary incremented sucessfully");
	}
}

