package com.Tryday3;

public class TryException {

	public static void main(String[] args) {
		try {
			int[] myArray = {10,20,30,40};
			System.out.println("Last element in array:" + myArray[3]);
			int n = 4/0;
			System.out.println(n);
			String a = "Something";
			System.out.println(a);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero: ");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Index Beyond reach of array limit");
		}

	}

}
