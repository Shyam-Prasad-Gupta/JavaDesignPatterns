package com.shyam.designpattern.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String args[]) {

		GetPlanFactory planFactory = new GetPlanFactory();

		System.out.println("Please enter the name of the plan: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String planName = br.readLine();

			System.out.println("Enter the number of units for bill will be calculated: ");
			int units = Integer.parseInt(br.readLine());

			Plan plan = planFactory.getPlan(planName);

			System.out.println("Bill amount for " + planName + " for " + units + "units is: ");
			plan.getRate();
			plan.calculateBill(units);
		} catch (IOException|NullPointerException ex) {
			ex.printStackTrace();
		}
	}

}
