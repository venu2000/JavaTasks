package com.Task3.EmployeeBonusSystem;

public class MainClass {
	
	 public static void main(String[] args) {
		
		 Employee manager1 = new Manager(1001, "Gopal", 2000000);
		 Employee dev1 = new Developer(1002, "Venu", 140000);
		 Employee tester1 = new Tester(1003, "Krishna", 60000);
		 
		manager1.displayDetails();
		dev1.displayDetails();
		tester1.displayDetails();
		 
		 
	}

}
