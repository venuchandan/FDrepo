package com.search;

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50};
		int target = 40;
		int flag = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == target) {
				flag = 1;
			}
			
		}
		if(flag == 1) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not found");
		}
	}

}
