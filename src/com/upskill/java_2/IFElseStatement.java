package com.upskill.java_2;

public class IFElseStatement {

	//Conditional Statement
	
	public static void main(String[] args) {
		
		int age = 101;
		
		if (age <=13) {
			System.out.println("You are children");
		} else if (age  >13 && age <18) {
			System.out.println("You are teenager !");
		} else if (age >= 60) {
			if (age>=100) {
				System.out.println("You are champion !");
			} else 
					System.out.println("You are Senior !");
		} else {
				System.out.println("You are adult !");
			
			}
					
				}
			

// For example, assigning grades (A, B, C) based on the percentage obtained by a student.

// if the percentage is above 90, assign grade A
// if the percentage is above 75, assign grade B
// if the percentage is above 65, assign grade C

public static void main1(String[] args){
	int percentage  = 96;
	if (percentage> 90) {
		System.out.println("Grade A");
	} else if (percentage> 75) {
		System.out.println("Grade B");
	} else if (percentage> 65) {
		System.out.println("Grade C");
		
	}
	
}
	
}
		
		


