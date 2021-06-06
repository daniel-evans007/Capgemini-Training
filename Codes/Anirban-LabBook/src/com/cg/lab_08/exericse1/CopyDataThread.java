package com.cg.lab_08.exericse1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread {

	File source;
	File target;
	
	
	public CopyDataThread() {
		
	}
	
	public CopyDataThread(File source, File target) {
		this.source = source;
		this.target = target;
	}
	
	public void run() {
		FileInputStream ip = null;
		
		try {
			ip = new FileInputStream(source);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		FileOutputStream op = null;
		
		int counter = 0, ch = 0;
		
		try {
			while ((ch = ip.read()) > 0) {
				op.write((char)ch);
				counter++;
				
				if (counter%10 == 0) {
					try {
						System.out.println("10 character are copied");
						Thread.sleep(5000);
					}
					catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}