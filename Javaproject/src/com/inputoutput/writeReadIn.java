package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeReadIn {

	public static void main(String[] args) {
		String fileName = "source.txt";
		String targetName = "target.txt";
		FileOutputStream fileOut = null;
		try {
			 fileOut = new FileOutputStream(fileName);
			 String msg = "fidelity";
			 byte[] arr = msg.getBytes();
			 fileOut.write(arr);
			 System.out.println("Data written successfully");
		}catch (IOException e) {
			System.out.println("error mesage");
		}
		try {
			FileInputStream fileIn = new FileInputStream(fileName);
			FileOutputStream fileOut1 = new FileOutputStream(targetName);
			int inputData;
			while((inputData = fileIn.read()) != -1)
			{
				System.out.print((char)inputData);
			}
			fileIn.close();
			fileOut1.close();
			System.out.println(" Text copied");
		}catch (IOException e) {
			System.out.println("error copying");
		}
	}

}
