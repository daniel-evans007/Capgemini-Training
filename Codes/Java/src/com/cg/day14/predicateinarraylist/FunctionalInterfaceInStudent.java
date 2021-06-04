package com.cg.day14.predicateinarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterfaceInStudent {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(100, "Danny"));
		studentList.add(new Student(101, "Kenny"));
		studentList.add(new Student(102, "Ben"));
		
		Function<Student, String> funcStdToString = (Student s) -> {
			return s.getStudentName();
		};
		
		Function<String, String> subStr = (String s) -> s.substring(0,1);
		
		List<String> studentNameInitials = convertStudentNameListToNamesList(studentList,
				funcStdToString.andThen(subStr));
		
		System.out.println("Student Initials...");
		
		studentNameInitials.forEach(str -> {System.out.println(str);});
	}
	
	public static List<String> convertStudentNameListToNamesList(List<Student> studentList,
			Function<Student, String>funcStdToString) {
		List<String> studentNameList = new ArrayList<String>();
		
		for (Student s : studentList) {
			studentNameList.add(funcStdToString.apply(s));
		}
		return studentNameList;
	}
}