package com.student.java;

public class StringDemo {
public static void main(String[] args) {
String r="my happiness is honey";

int length =r.length();
System.out.println(length);

boolean equals =r.equals("my happiness is honey");
System.out.println(equals);

boolean equalsIgnoreCase =r.equalsIgnoreCase("my happiness is honey");
System.out.println(equalsIgnoreCase);

boolean contains =r.contains("honey");
System.out.println(contains);

char charAt= r.charAt(19);
System.out.println(charAt);

int indexOf=r.indexOf("h");
System.out.println(indexOf);

String uppercaseString=r.toUpperCase();
System.out.println(uppercaseString);


String lowercaseString=r.toLowerCase();
System.out.println(lowercaseString);


boolean startswith  =r.startsWith("my");
System.out.println(startswith);

boolean endswith=r.endsWith("ey");
System.out.println(endswith);

String replace =r.replace("honey","HONEY");
System.out.println(replace);

String replace2 =r.replace("my", "MY");
System.out.println(replace2);

CharSequence subsequence= r.subSequence(1,20);
System.out.println(subsequence);

String substring =r.substring(4);
System.out.println(substring);



}
}
