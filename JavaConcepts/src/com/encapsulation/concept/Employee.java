package com.encapsulation.concept;

public class Employee {
	
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("Mava");
		String name = e.getName();
		System.out.println(name);
	}

}
