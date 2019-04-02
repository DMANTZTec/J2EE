package com.dmantz.serializationanddeserialization;

import java.beans.Transient;
import java.io.Serializable;

public class Person implements Serializable {
	
	
	/*An Object is said to be serializable if and only if the corresponding class should implement
	  serializable interface.
	
	  While performing serialization if u don’t want to save the value of a particular variable, that
	  variable we have declared with transient keyword
	  */
	
	private  String name;
	private  int age;
	private transient String salary;
	
			
	public Person(String name, int age, String salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	
	
	

}
