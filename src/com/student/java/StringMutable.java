package com.student.java;

public class StringMutable {

	
	public static void main(String[] args) {
	 StringBuffer a = new StringBuffer("happy");
	 StringBuffer a1 =new StringBuffer("foundation");
	 StringBuffer a3 =new StringBuffer("limited");
	 
	 System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(a1));
	System.out.println(System.identityHashCode(a3));
	
	StringBuffer append =a.append(a1);
	System.out.println(append);
	System.out.println(System.identityHashCode(append));
	
	
	
	StringBuilder s = new StringBuilder("avm studio");
	StringBuilder s1 = new StringBuilder("avm studio ");
	StringBuilder s2 = new StringBuilder("camera");
 
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
   
	}

	
}
