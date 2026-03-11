package com.Tryday3;

public class TestThrow {
	public static void checkAge(int age) throws ArithmeticException, RuntimeException {
	if(age<18) {
		throw new ArithmeticException("Under age cannot be passed: ");
	}else {
		System.out.println("Age is valid");
		
}
	if(age>50) {
		throw new RuntimeException("Overage");
	}else {
		System.out.println("age is valid");
	}
	}
	public static void main(String [] args) {
		try {
		checkAge(20);
		}
		catch(ArithmeticException e) {
		System.out.println("Exception caught"+ e.getMessage());
		}
		finally {
			System.out.println("I will execute anyways: ");
			
		}
		}
	}

