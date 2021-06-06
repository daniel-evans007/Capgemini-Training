package com.cg.lab_08.exericse1;

import java.io.File;

public class FileProgram {

	public static void main(String[] args) {
		File source = new File("D:\\Capgemini Training\\Codes\\Anirban-LabBook\\src\\com\\cg\\lab_08\\exericse1\\source.txt");
		File target = new File("D:\\Capgemini Training\\Codes\\Anirban-LabBook\\src\\com\\cg\\lab_08\\exericse1\\target.txt");
		
		CopyDataThread cp = new CopyDataThread(source, target);
		cp.start();
	}
}