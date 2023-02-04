package com.upskill.assignment_1;

public class AccessModifer {
	
	public String name = "Tanzu";				//Public - Any class can access

	private int age = 30;						//Private - only same class can access
	
	protected int ssn = 123456;					//Protected - classes in the same package and subclass can access
	
			String address = "Heritage Tower";	//Default - class in same package can access
}
