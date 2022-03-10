package com.student.java;

public class VariableDemo extends ClassInherit {
	static int  a=10;
	
	public void test() {
		int b=12;
		System.out.println(a);
	
		
		
	System.out.println(this.a);
	System.out.println(super.a);
	}
     
	
	public static void main(String[] args) {
		VariableDemo w = new VariableDemo();
		w.test();
	   
	}


}