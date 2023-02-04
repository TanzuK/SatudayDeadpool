com.upskill.java_4;

com.upskill.java_2.MethodType;

public class Polymorphism extends MethodType{

/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/
	
	public static void main(String[] args) {
		car(6, "Single");

	Polymorphism obj = new Polymorphism();
		obj.annualIncome();
	}
	
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	
	public void annualIncome(){
		System.out.println("My Annual Income = 150000");
	}
	
	
	//Method Overloadin…

	public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	private String name = "upskill";			//write & read
	private int ssn = 45213678;					//write only
	private String username = "raselalam";		//read only
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Rasel");
		System.out.println(obj.getName());
		obj.setSSN(56845214);
		System.out.println(obj.getUsername());
	}
	
	//Setter Method - name						//set the data, Write
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name						//get the data, Read
	public String getName(){
		return name;
	}
	
	//Setter Method - ssn						//set the data, Write only
	public void…
	package com.upskill.java_4;

	public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	private String name;				//write & read
	private int ssn;					//write only
	private String username;			//read only
	private int age;
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Rasel");
		System.out.println(obj.getName());
		obj.setSSN(56845214);
		System.out.println(obj.getUsername());
		obj.setAge(30);
		System.out.println(obj.getAge());
	}
	
	//Setter Method - age						//set the data, Write
	public void setAge(int value){
		age = value;
	}
	
	//Getter Method - age						//get the data, Read
	public int getAge(){
		return age;
	}
	
	//Setter Method - name						//set the data com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	private String name;				//write & read
	private int ssn;					//write only
	private String username;			//read only
	private int age;
	private String city;
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Rasel");
		System.out.println(obj.getName());
		obj.setSSN(56845214);
		System.out.println(obj.getUsername());
		obj.setAge(30);
		System.out.println(obj.getAge());
		obj.setCity("NYC");
		System.out.println(obj.getCity());
	}
	
	//Setter Method - age						//set the data, Write
	public void setCity(String value){
		city = value;
	}
	
	//Getter Method - age						//get the data, R…
	ssn = value;
	}
	
	//Getter Method - username		 			//get the data, Read only
	public String getUsername(){
		return username;
	}
}
	package com.upskill.java_4;

	public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	private String name;				//write & read
	private int ssn;					//write only
	private String username;			//read only
	private int age;
	private String city;
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Rasel");
		System.out.println(obj.getName());
		obj.setSSN(56845214);
		System.out.println(obj.getUsername());
		obj.setAge(30);
		System.out.println(obj.getAge());
		obj.setCity("NYC");
		System.out.println(obj.getCity());
	}
	
	//Setter Method - age						//set the data, Write
	public void setCity(String value){
		city = value;
	}
	
	//Getter Method - age						//get the data, Read
	public String getCity(){
		return city;
	}	
	//Setter Method - age						//set the data, Write
	public void setAge(int value){
		age = value;
	}
	
	//Getter Method - age						//get the data, Read
	public int getAge(){
		return age;
	}
	
	//Setter Method - name						//set the data, Write
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name						//get the data, Read
	public String getName(){
		return name;
	}
	
	//Setter Method - ssn						//set the data, Write only
	public void setSSN(int value){
		ssn = value;
	}
	
	//Getter Method - username		 			//get the data, Read only
	public String getUsername(){
		return username;
	}
}
	

