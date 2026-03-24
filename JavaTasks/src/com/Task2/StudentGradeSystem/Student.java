package com.Task2.StudentGradeSystem;

import java.util.Objects;

public class Student {
	
	
	private String studentId;
	private String name;
	private int marks;

	
	public Student(String studentId, String name, int i) {
	
		this.studentId = studentId;
		this.name = name;
		this.marks = i;
	}
	
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(marks, name, studentId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(marks, other.marks) && Objects.equals(name, other.name)
				&& Objects.equals(studentId, other.studentId);
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId +"|"+ " name=" + name + "| marks=" + marks + "]";
	}
	
	
	
	

}
