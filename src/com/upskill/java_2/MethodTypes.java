package com.upskill.java_2;

public class MethodTypes {

/*	Type of Method 
 
 	1. Void Method 
 	2. Static Method 
 	3. Return Type Method 
 	*/
 	public static int hourlyIncome = 65;
 	
 	public static void main(String[] args) {
 		MethodTypes obj = new MethodTypes();
 		obj.annualIncome();
	
		weeklyIncome();
		Tanzu();
		obj.Tanzu2();
		
		
 	System.out.println("My Monthly Income = " + obj.monthlyIncome());
 	}
 	
 	//void Method
 	public void annualIncome(){
 		int calculateAnnualIncome = hourlyIncome * 2000;
 		System.out.println("My Annual Income = " + calculateAnnualIncome);
 	}
 	
	//static Method 
 	public static void weeklyIncome() {
 		int calculateWeeklyIncome = hourlyIncome * 40;
 		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
 	}
 	
	//return type method 
 	public int monthlyIncome() {
 		int calculateMonthlyIncome = hourlyIncome * 180;
 		return calculateMonthlyIncome;
 	}
 	
 	
 	public  static void Tanzu() {
 		String name = "Tanzu Khatun";
 		int age = 30;
 		System.out.println(name);
 	}
 	
 	public  void Tanzu2() {
 		String name = "Tanzu Khatun";
 		int age = 30;
 		System.out.println(name);

}
}
		

	


