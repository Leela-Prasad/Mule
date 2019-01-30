package com.boa;

public class Employee {

	private int id;
	private String name;
	private int salary;
	private boolean enabled;
	
	public Employee() {}
	
	public Employee(int id, String name, int salary, boolean enabled) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.enabled = enabled;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
