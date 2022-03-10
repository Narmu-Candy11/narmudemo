package com.student.java;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   //Arithmetic exception
   try {
	   int a=10; int b=20;
	   int c=30;
	   System.out.println(c);
   }
   catch (ArithmeticException e)
   {
	   System.out.println("ArithmeticException:");
	   
	   
	   
   }
 
	}

}
