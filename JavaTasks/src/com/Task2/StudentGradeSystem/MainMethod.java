package com.Task2.StudentGradeSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainMethod {

	public static void main(String[] args) {
		
		Student s1 = new Student("1000","Naveena", 83);
		Student s4 = new Student("1001", "Venu", 89);
		Student s2 = new Student("1003","Su", 95);
		Student s3 = new Student("1004", "Gopal", 78);
		Student s5 = new Student("1010", "Anu", 69);
		
		
		//adding Objects into ArrayList
		List<Student> students = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
		
		for (Student student : students) {
			System.out.println(student);
			
		}
		
		
		
		
		
	System.out.println("=======================");	
		
	List<String> Grade = students
	.stream()
	.map(n->String.format("%-10s --> %-7s ",n.getName(), 
			//Used Ternary Operation
			 (n.getMarks()>90?"Grade-A" 
			: n.getMarks()>80 ?"Grade-B"
			: n.getMarks()>70  ?"Grade-C":"Grade-D")))
	.collect(Collectors.toList());
	
	Grade.forEach(System.out::println);
   
	}


}
