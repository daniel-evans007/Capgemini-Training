package com.cg.day15.javaIOdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExample {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileOutputStream fOut = new FileOutputStream("D:\\Capgemini Training\\Codes\\Java\\src\\com\\cg\\day15\\javaIOdemo\\Sample\\SampleTextFile.txt");
			String s = "My name is Anirban";
			byte[] b = s.getBytes(); //converting string into byte array.
			fOut.write(b);
			fOut.close();
			System.out.println("File created successfully...");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fInput = new FileInputStream("D:\\Capgemini Training\\Codes\\Java\\src\\com\\cg\\day15\\javaIOdemo\\Sample\\SampleTextFile.txt");
			int ch;
			while ((ch = fInput.read()) != -1) {
				System.out.print((char)ch);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
