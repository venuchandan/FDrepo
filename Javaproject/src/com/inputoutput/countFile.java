package com.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class countFile {

	public static void main(String[] args) {
		String file = "data.txt";
		try {
			
		
		FileOutputStream out = new FileOutputStream(file);
		System.out.println(file.length());
		
		}catch (IOException e) {
			System.out.println("error");
		}
	}

}
