package com.basic;
import java.util.Scanner;
public class EmpMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		int choice;
		
		do {
			System.out.println("Employee Menu");
			System.out.println("1. Accept Employee Data");
			System.out.println("2. Display Employee Data");
			System.out.println("3. Increment Salary");
			System.out.println("4. Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				emp.acceptData();
				break;
			case 2:
				emp.displayData();
				break;
			case 3:
				emp.incrementSalary();
				break;
			case 4:
				System.out.println("Thankyou");
				break;
				
			default:
				System.out.println("invalid choice");
			}
		
	}while (choice!=4);
	}
}
