package com.example.qa;

public class StringExample {

	static String d;
	static int i;
	public static void main(String[] args) {
		
		String s="abcd1234";
		
		System.out.println(d);
		System.out.println(i);
		System.out.println(s);
		int r = Integer.parseInt(s.replace("abcd", ""));
		System.out.println(r);
	}
	
}
