package com.shyam.designpattern.abstractfactory;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		return null;
	}

	@Override
	public Loan getLoan(String loan) {

		if (loan == null) {
			return null;
		}
		if (loan.equalsIgnoreCase("HOME")) {
			return new HomeLoan();
		} else if (loan.equalsIgnoreCase("BUSINESS")) {
			return new BusinessLoan();
		} else if (loan.equalsIgnoreCase("EDUCATION")) {
			return new EducationLoan();
		}

		return null;
	}
}
