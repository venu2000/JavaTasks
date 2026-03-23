package com.Task3.EmployeeBonusSystem;

public class Developer extends Employee{

	public Developer(int empId, String name, double salary) {
		super(empId, name, salary);
		
	}
	
	
	@Override
	public double calculateBonus() {
	
		return getSalary()*0.10;
	}
	
	
	

}
