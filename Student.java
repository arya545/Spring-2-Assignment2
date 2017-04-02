/**
 * 
 */
package com.spring.hello;

/**
 * @author SURYA
 *
 */
public class Student {
	private String name;
	

	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}
	

	
	
	public void displayInfo()
	{
		System.out.println("Hello "+ name);
	}




}
