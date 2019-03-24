package com.shyam.designpattern.factorymethod;

public class GetPlanFactory {

	public Plan getPlan(String planType) {

		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DomesticPlan")) {
			return new DomesticPlan();
		}
		if (planType.equalsIgnoreCase("InstitutionalPlan")) {
			return new InstitutionalPlan();
		}
		if (planType.equalsIgnoreCase("CommercialPlan")) {
			return new CommercialPlan();
		}
		return null;
	}
}
