package com.cg.lab_03;

import java.io.*;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int lineNumber = 0, wordNumber = 0, charNumber, i;
		char ch;
		
		File file = new File("D:\\Capgemini Training\\Codes\\Anirban-LabBook"
				+ "\\src\\lab_three\\test.txt");
		
		FileInputStream f = new FileInputStream(file);
		
		charNumber = f.available();
		
		for (i=0;i<charNumber;i++) {
			ch = (char)f.read();
			if (ch == '.') {
				lineNumber++;
			}
			else if (ch == ' ') {
				wordNumber++;
			}
		}
		
		System.out.print("Number of lines: "+lineNumber);
		System.out.print("\nNumber of words: "+wordNumber);
		System.out.print("\nNumber of characters: "+charNumber);
		
		sc.close();
		f.close();
	}
}