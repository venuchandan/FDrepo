package com.interfacetopic;

abstract public class Employee implements payable{
	protected int empId;
	protected String name;
	protected double basicSalary;
	public Employee(int empId, String name, double basicSalary) {
		super();
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	//abstract method
	//public abstract double calculateSalary();
	//non abstract method
	public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}
