package com.shyam.designpattern.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PrototypeDemo {

	public static void main(String args[]) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the employee id: ");
			int id = Integer.parseInt(br.readLine());

			System.out.println("Enter the employee name: ");
			String name = br.readLine();

			System.out.println("Enter the employee designation: ");
			String designation = br.readLine();

			System.out.println("Enter the employee address: ");
			String address = br.readLine();

			System.out.println("Enter the employee salary: ");
			double salary = Double.parseDouble(br.readLine());

			EmployeeRecord empr = new EmployeeRecord(id, name, designation, address, salary);
			EmployeeRecord empr1 = (EmployeeRecord) empr.getClone();

			System.out.println(empr.equals(empr1));
			System.out.println(empr.toString());
			System.out.println(empr1.toString());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
