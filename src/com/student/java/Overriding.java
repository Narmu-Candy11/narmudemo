 package com.student.java;

public class Overriding extends MethodDemo {

	public void empAge() {
		super.empage();
		System.out.println("empAge is 23 ");
		
	}
	public void empname() {
		super.empname();
	
	}
	public void empid() {
		super.empid();
		
	}
	public static void main(String[] args) {
		Overriding f= new Overriding();
		f.empAge();
		f.empname();
		f.empid();

	}

}
