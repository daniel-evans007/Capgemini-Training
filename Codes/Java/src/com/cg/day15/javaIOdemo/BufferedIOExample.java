package com.cg.day15.javaIOdemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOExample {

	public static void main(String[] args) {
		try {
			FileOutputStream fOut = new FileOutputStream("D:\\Capgemini "
					+ "Training\\Codes\\Java\\src\\com\\cg\\day15\\javaIOdemo\\Sample\\SampleTextFile.txt");
			BufferedOutputStream bOp = new BufferedOutputStream(fOut);
			String s = "It was created using BufferedOutputStream";
			byte[] b = s.getBytes(); //converting string into byte array.
			bOp.write(b);
			bOp.flush();
			bOp.close();
			System.out.println("Successfully written data from buffer to file...");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}