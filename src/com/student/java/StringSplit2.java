package com.student.java;

public class StringSplit2 {


	public static void main(String[] args) {

		String s ="Elegance never goes out of style";
		String split[]=s.split(" ",5 );
		for(String string : split)
		System.out.println(string);
	}

}
