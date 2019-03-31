package com.shyam.designpattern.prototype;

public class EmployeeRecord implements Prototype {

	private int id;
	private String name, designation, address;
	private double salary;

	public EmployeeRecord() {
		System.out.println("   Employee Records of Oracle Corporation ");
		System.out.println("---------------------------------------------");
		System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t\t" + "Eaddress");
	}

	public EmployeeRecord(int id, String name, String designation, String address, double salary) {
		this();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.address = address;
		this.salary = salary;
	}

	public void showRecord() {
		System.out.println(
				this.id + "\t" + this.name + "\t" + this.designation + "\t" + this.salary + "\t" + this.address);
	}

	@Override
	public Prototype getClone() {
		return new EmployeeRecord(this.id, this.name, this.designation, this.address, this.salary);
	}
}
