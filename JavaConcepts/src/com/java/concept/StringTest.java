package com.java.concept;

public class StringTest {

	public static void main(String[] args) {
		
		String s1=new String("This is You");
		String s2=new String("This is you");
		boolean value=s1.equals(s2);
		System.out.println(value);
		
		System.out.println(s1==s2);
		
		

	}

}
