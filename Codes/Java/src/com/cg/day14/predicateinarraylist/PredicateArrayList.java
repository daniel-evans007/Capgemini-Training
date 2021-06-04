package com.cg.day14.predicateinarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateArrayList {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(100, "Rama"));
		studentList.add(new Student(101, "Danny"));
		studentList.add(new Student(102, "Kenny"));
		studentList.add(new Student(103, "Roger"));
		studentList.add(new Student(104, "Jenny"));
		studentList.add(new Student(105, "Benjamin"));
		studentList.add(new Student(106, "Redfield"));
		studentList.add(new Student(107, "Lakshman"));
		
		List<Student> namesStartsWithR = filterByName(studentList, (Student s) -> s.getStudentName().startsWith("R"));
		System.out.println(namesStartsWithR);
	}

	private static List<Student> filterByName(List<Student> studentList, Predicate<Student> pred) {
		List<Student> resultList = new ArrayList<Student>();
		
		for (Student s : studentList) {
			if (pred.test(s)) {
				resultList.add(s);
			}
		}
		return resultList;
	}
}