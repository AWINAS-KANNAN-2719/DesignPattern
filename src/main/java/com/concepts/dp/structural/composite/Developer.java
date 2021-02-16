package com.concepts.dp.structural.composite;

//LEAF
public class Developer implements Employee {

	private String name;
	private long empId;
	private String position;

	public Developer(long empId, String name, String position) {
		// Assign the Employee id,
		// name and the position
		this.empId = empId;
		this.name = name;
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(empId + " " + name + " " + position);
	}
}