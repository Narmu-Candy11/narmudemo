package com.student.java;

public class AbsDemo extends AbstractionDemo {

	public void  vehicleloan() {

	System.out.println("vehicleloan is 20 lakhs");
	}

	
public void eduloan() {
	System.out.println("eduloan is 30lakhs");
}

public void homeloan() {
	super.homeloan();
	
}
	public static void main(String[] args) {
	AbsDemo e = new AbsDemo();
	e.eduloan();
	e.vehicleloan();
	e.homeloan();
	}

}
