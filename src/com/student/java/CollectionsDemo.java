package com.student.java;

import java.util.LinkedList;


public class CollectionsDemo {

	public static void main(String[] args) {
 
		LinkedList<Object>li= new LinkedList<Object>();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(null);
		li.add(3,"sharu");
		
		System.out.println(li);
		Object object = li.get(1);
		System.out.println(object);
		
		Object set = li.set(2,100);
		System.out.println(set);
		System.out.println(li);
		
		
		  
		 
	
	
	 
	
	}

}
