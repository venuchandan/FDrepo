package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class testFileIo {
	public static void main(String[] args) throws IOException {
		String fileName = "data.txt";
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(fileName);
			String msg = "Fidelity";// convert message to a byte array bcoz write needs byte array
			byte[] arr = msg.getBytes();
			
			
			
			out.write(arr);
			System.out.println("Data written successfully");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			out.close();
		}
		System.out.println("Reading from file ");
		FileInputStream fis = new FileInputStream(fileName);
		int byteData;
		while((byteData = fis.read()) != -1)
		{
			System.out.print((char)byteData);
		}
		fis.close();
}
	
}
