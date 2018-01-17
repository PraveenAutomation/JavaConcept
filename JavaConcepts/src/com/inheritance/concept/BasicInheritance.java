/**
 * 
 */
package com.inheritance.concept;

import java.net.StandardSocketOptions;

/**
 * @author pk.mishra
 * Basics of Inheritance
 */
public class BasicInheritance {
	
	public static void main(String[] args) {
		BasicInheritance d =new BasicInheritance();
		

	}
	
	class Animal
	{
		void eat()
		{
			System.out.println("Eating...");
		}
	}
	
	class Dog extends Animal
	{
		void bark()
		{
			System.out.println("Bhow...");
		}
	}
	
	
}
