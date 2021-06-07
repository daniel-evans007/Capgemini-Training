package com.cg.day15.javaIOdemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Staring reading of the file...");
		
		RandomAccessFile raFile = new RandomAccessFile("D:\\Capgemini Training\\Codes\\Java\\src\\com\\cg\\day15\\javaIOdemo\\Sample\\data.txt", "rw");
		FileChannel fCh = raFile.getChannel();
		System.out.println("Created File Channel...");
		//creating bytebuffer capacity of 48 bytes
		ByteBuffer buffer = ByteBuffer.allocate(48);		
		//reading data from the bytebuffer
		int bytesRead = fCh.read(buffer);
		//iterating over the bytes
		while (bytesRead != -1) {
			System.out.println("\nRead "+bytesRead);
			buffer.flip();
			
			while (buffer.hasRemaining()) {
				System.out.print((char)buffer.get());
			}
			buffer.clear();
			bytesRead = fCh.read(buffer);
		}
		raFile.close();
	}
}