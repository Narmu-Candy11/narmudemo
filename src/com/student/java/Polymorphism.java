package com.student.java;

public class Polymorphism {

	public void stdDetails() {
		System.out.println("studentName is aishu");
		
	} 
	public void stdDetails(int id ) {
		System.out.println("student id is " +id);
		
	}
	
	public void stdDetails(char a,String s) {
		System.out.println("student grade is"+" "+a +"," +s);
		
	}
		
	public static void main(String[] args) {
		Polymorphism a =new Polymorphism();
		a.stdDetails();
		a.stdDetails(001);
		a.stdDetails('A',"good");

	}

}
