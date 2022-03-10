package com.student.java;

import java.util.IdentityHashMap;

public class StringImmutable {

	public static void main(String[] args) {
	
		String a="honey";
		String a1="honey";
		String a3="puppy";
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(a1));
	    System.out.println(System.identityHashCode(a3));

	String concat = a.concat(a1);
	System.out.println(concat);
	
	String concat1 =a.concat(a3);
	System.out.println(concat1);
	
	System.out.println(System.identityHashCode(concat));
	System.out.println(System.identityHashCode(concat1));
	}

}
