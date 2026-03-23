package com.Task3.EmployeeBonusSystem;

public class Tester extends Employee {

	public Tester(int empId, String name, double salary) {
		super(empId, name, salary);
		
	}
	
	@Override
	public double calculateBonus() {
		
		return getSalary()*0.05;
	}

}
