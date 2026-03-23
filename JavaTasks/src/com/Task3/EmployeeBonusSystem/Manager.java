package com.Task3.EmployeeBonusSystem;

public class Manager extends Employee{

	public Manager(int empId, String name, double salary) {
		super(empId, name, salary);
		
	}
	
	@Override
	public double calculateBonus() {
		return  getSalary()*0.20  ;
		
	}

}
